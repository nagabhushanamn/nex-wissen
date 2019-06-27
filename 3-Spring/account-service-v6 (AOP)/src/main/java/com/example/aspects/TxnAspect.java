package com.example.aspects;

import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.example.service.TxrService;

@Component
@Aspect
public class TxnAspect {

//	@Before("execution(boolean transfer(..))")
//	public void before() {
//		System.out.println("Txn - begin");
//	}
//	@AfterReturning(pointcut="execution(boolean transfer(..))",returning="r")
//	public void afterReturining(Object r) {
//		System.out.println("Txn - commit");
//	}
//	@AfterThrowing(pointcut="execution(boolean transfer(..))",throwing="e")
//	public void afterThrowing(Throwable e) {
//		System.out.println("Txn - rollback");
//	}
//	@After("execution(boolean transfer(..))")
//	public void after() {
//		System.out.println("Txn - release Txn resources i.e connection");
//	}

	@Around("execution(boolean transfer(double,String,String)) && target(txrService)")
	public Object around(ProceedingJoinPoint jp,TxrService txrService) {
		
//		System.out.println(txrService instanceof TxrService);
//		for(Object arg:jp.getArgs()) {
//			System.out.println(arg);
//		}
		
		Object o=null;
		try {
			System.out.println("Txn - begin");
			o = jp.proceed();
			System.out.println("Txn - commit");
		} catch (Throwable e) {
			System.out.println("Txn - rollback");
		} finally {
			System.out.println("Txn - release Txn resources i.e connection");
		}
		return o;
	}
	
	
}
