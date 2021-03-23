/**
 * 
 */
package com.aop.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	@After("args(name)")
	public void getargsmethod(String name) {
		System.out.println("args is called "+name);
	}
	
	// for maintaining both input and output of method called
	@AfterReturning(pointcut="args(name)",returning = "outputofmethod")
	public void getoutputofMethod(String name, Object outputofmethod) {
		System.out.println("args is passed to method "+name+ " final  output of method returning "+outputofmethod);
	}
	
	
	// for maintaining method if exception occurs
	@AfterThrowing(pointcut="args(name)",throwing = "exceptionOccuredInMethod")
	public void getoutputofMethod(String name, Exception exceptionOccuredInMethod) {
		System.out.println("args is passed to method "+name+ " final exceptionthat Occured In Method called method"+exceptionOccuredInMethod);
	}

	
	// for maintaining all actions together instead_of using different call for get and set methods like wise
	//-----Major points--//
	//argument ProceedingJoinPoint pjp should allways present in Around advice call
	//ProceedingJoinPoint.proceed -- this is for calling target method execution---this is optional call
	
	@Around("getmethod()")
	public Object getAroundAdvice(ProceedingJoinPoint pjp) {
		Object returnvalue = null;
		System.out.println("before target called");
		try {
			pjp.proceed();//to call the target method ---(getmethod)
			System.out.println("After target called");
		} catch (Throwable e) {
			System.out.println("Exception in executing getmethods()");
		}
		System.out.println("End of around advice ");
		return returnvalue;
	}

	@Pointcut("within(com.aop.ticketbooking.services.*)")
	public void getmainclassmethod() {
	}
	
	
	
	@Around("@annotation(com.aop.logger.LoggableAnnotation)")
	public Object getCustomAopAnnotation(ProceedingJoinPoint pjp) {
		Object returnvalue = null;
		System.out.println("before getCustomAopAnnotation called");
		try {
			pjp.proceed();//to call the target method ---(getmethod)
			System.out.println("After getCustomAopAnnotation called");
		} catch (Throwable e) {
			System.out.println("Exception in executing getmethods()");
		}
		System.out.println("End of getCustomAopAnnotation around advice ");
		return returnvalue;
	}
}
