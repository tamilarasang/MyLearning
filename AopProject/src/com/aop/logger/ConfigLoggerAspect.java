/**
 * 
 */
package com.aop.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author tamil
 *
 */
@Aspect
public class ConfigLoggerAspect {
	
//	@Around("getmethod()")
//	public Object getAroundAdvice(ProceedingJoinPoint pjp) {
//		Object returnvalue = null;
//		System.out.println("before target called");
//		try {
//			pjp.proceed();//to call the target method ---(getmethod)
//			System.out.println("After target called");
//		} catch (Throwable e) {
//			System.out.println("Exception in executing getmethods()");
//		}
//		System.out.println("End of around advice ");
//		return returnvalue;
//	}
	
	public Object getConfigAroundAdvice(ProceedingJoinPoint pjp) {
		Object returnvalue = null;
		System.out.println("before getConfigAroundAdvice target called");
		try {
			pjp.proceed();//to call the target method ---(getmethod)
			System.out.println("After getConfigAroundAdvice target called");
		} catch (Throwable e) {
			System.out.println("Exception  getConfigAroundAdvice in executing getmethods()");
		}
		System.out.println("End of getConfigAroundAdvice around advice ");
		return returnvalue;
	}
	
//	@Around("@annotation(com.aop.logger.LoggableAnnotation)")
//	public Object getCustomAopAnnotation(ProceedingJoinPoint pjp) {
//		Object returnvalue = null;
//		System.out.println("before  getConfigAroundAdvice getCustomAopAnnotation called");
//		try {
//			pjp.proceed();//to call the target method ---(getmethod)
//			System.out.println("After   getConfigAroundAdviceg etCustomAopAnnotation called");
//		} catch (Throwable e) {
//			System.out.println("Exception getConfigAroundAdvice in executing getmethods()");
//		}
//		System.out.println("End of getConfigAroundAdvicegetCustomAopAnnotation around advice ");
//		return returnvalue;
//	}
//	
	public Object getCustomAopAnnotation(ProceedingJoinPoint pjp) {
		Object returnvalue = null;
		System.out.println("before  getConfigAroundAdvice getCustomAopAnnotation called");
		try {
			pjp.proceed();//to call the target method ---(getmethod)
			System.out.println("After   getConfigAroundAdviceg etCustomAopAnnotation called");
		} catch (Throwable e) {
			System.out.println("Exception getConfigAroundAdvice in executing getmethods()");
		}
		System.out.println("End of getConfigAroundAdvice getCustomAopAnnotation around advice ");
		return returnvalue;
	}
}
