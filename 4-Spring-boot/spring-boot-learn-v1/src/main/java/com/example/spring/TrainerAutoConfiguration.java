package com.example.spring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass(name = "com.example.BlaBlaBla")
//@ConditionalOnMissingClass(value = "com.example.BlaBlaBla")
//@ConditionalOnBean(name = "txnServiceImpl")
@ConditionalOnProperty(name = "sub", prefix = "trainer")
@ConfigurationProperties(prefix = "trainer")
public class TrainerAutoConfiguration {

	private String sub;
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Bean(name = "sub1")
	public String getSubject1() {
		return sub + "-java - " + duration;
	}

	@Bean(name = "sub2")
	public String getSubject2() {
		return sub + "-js";
	}

}
