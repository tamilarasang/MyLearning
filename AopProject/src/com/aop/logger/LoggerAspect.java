/**
 * 
 */
package com.aop.logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.aop.ticketbooking.modelDto.Theater;

/**
 * @author tamil
 *
 */
@Aspect
public class LoggerAspect {
	
	//advice method - advice jar
	@Before("getmethod() && getmainclassmethod()")
	public void Begins() {
		System.out.println("Method is started");
	}
	@After("setmethod()")
	public void End() {
		System.out.println("Method is Ended");
	}
	
	@Pointcut("execution (* set*(..))")
	public void setmethod() {
	}
	
	@Pointcut("execution (* get*(..))")
	public void getmethod() {
	}
	

	@Pointcut("within(com.aop.ticketbooking.services.*)")
	public void getmainclassmethod() {
	}
}
