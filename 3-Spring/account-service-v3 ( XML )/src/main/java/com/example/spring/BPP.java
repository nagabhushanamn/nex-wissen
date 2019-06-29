package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.example.service.TxrServiceImpl;

public class BPP implements BeanPostProcessor {

	private static final Logger LOGGER = Logger.getLogger("App");

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		LOGGER.info("BPP : before init() -> " + beanName);
//		if (beanName.equals("txrService")) {
//			TxrServiceImpl txrService = (TxrServiceImpl) bean;
//			if (txrService.getTxrType().isEmpty())
//				throw new BeanCreationException("txrType is empty");
//		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		LOGGER.info("BPP : after init() -> " + beanName);
		if (beanName.equals("txrService")) {
			TxrServiceImpl txrService = (TxrServiceImpl) bean;
			if (txrService.getTxrType().isEmpty())
				throw new BeanCreationException("txrType is empty");
		}
		return bean;
	}

}
