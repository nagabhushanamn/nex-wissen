package com.example.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BFPP implements BeanFactoryPostProcessor {

	private static final Logger LOGGER = Logger.getLogger("App");

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		LOGGER.info("BFPP :: postProcessBeanFactory()");
		System.out.println(beanFactory.getBeanDefinitionCount());
	}
}
