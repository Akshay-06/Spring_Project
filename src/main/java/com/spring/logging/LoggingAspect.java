package com.spring.logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	// Before will execute before the controller method is called
	@Before("execution (public * com.spring.controller.CricketerController.getCricketers())")
	public void logBefore() {
		LOGGER.info("getCricketers method called from aspect");
	}

	// Below method will execute only if the controller method executes without any
	// exceptions or errors
	@AfterReturning("execution (public * com.spring.controller.CricketerController.getCricketers())")
	public void logAfterSuccessfullExecution() {
		LOGGER.info("getCricketers method is successfully executed without any exceptions or errors");
	}

	// Below method will execute only if the controller method throws an exception
	@AfterThrowing("execution (public * com.spring.controller.CricketerController.getCricketers())")
	public void logException() {
		LOGGER.info("getCricketers method has an issue");
	}

	// After will execute after the controller method is executed, this will execute
	// even if the method gives exception
	@After("execution (public * com.spring.controller.CricketerController.getCricketers())")
	public void logAfter() {
		LOGGER.info("getCricketers method is executed");
	}

}
