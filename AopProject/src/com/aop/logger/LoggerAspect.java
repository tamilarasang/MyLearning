/**
 * 
 */
package com.aop.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author tamil
 *
 */
@Aspect
public class LoggerAspect {
	
	//advice method - advice jar
	@Before("getmethod() && getmainclassmethod()")
	public void Begins(JoinPoint joinpoint) {
		System.out.println(joinpoint.getTarget().getClass().getSimpleName()+" "+joinpoint.getSignature().getName());
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
