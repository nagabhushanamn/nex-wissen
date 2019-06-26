package com.example.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import org.aspectj.lang.JoinPoint;

@Component
@Aspect
public class CommonAspect {

	@Before("execution(* *(..))")
	public void before(JoinPoint jp) {
		System.out.println("before " + jp.toShortString());
	}

}
