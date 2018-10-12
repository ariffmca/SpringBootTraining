package com.ameya.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	// otherMethod is to be configured as before advice for all
	// employee methods demonstrating multiple pointcuts
	// and multiple before advices within a aspect
	public void otherMethod() {
		System.out.println("++++++++++++++++++++++++++");
	}
	public void beforeAdvice() {
		System.out.println("++++ BEFORE ADVICE ++++");
	}
	public void afterAdvice() {
		System.out.println("++++ AFTER ADVICE ++++");
	}
	public void afterReturningAdvice(Object retVal) {
		System.out.println("++++ AFTER RETURNING ADVICE :: "+retVal.toString());
	}
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("++++ AFTER THROWING ADVICE ++++ :: "+ex.toString());
	}
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		Object object=null;
	System.out.println("AROUND ADVICE - BEFORE "+joinPoint.getSignature());
		try {
			object=joinPoint.proceed();
			System.out.println("AROUND ADVICE - AFTER "+joinPoint.getSignature());
		} catch (Throwable e) {
			throw e;
		}
		return object;
	}
}
