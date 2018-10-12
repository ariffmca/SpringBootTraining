package com.learn.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspectJ {

	@Pointcut("execution(* com.ameya.models.*.*(..))")
	private void allMethodsPointcut() {}
	
	@Before("allMethodsPointcut()")
	public void beforeAdvice() {
		System.out.println("+++ BEFORE ADVICE +++");
	}
	@After("allMethodsPointcut()")
	public void afterAdvice() {
		System.out.println("+++ AFTER ADVICE +++");
	}
	@AfterReturning(returning="retVal",pointcut="allMethodsPointcut()")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("+++ AFTER RETURNING +++ "+retVal.toString());
	}
	@AfterThrowing(throwing="ex",pointcut="allMethodsPointcut()")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("+++ AFTER THROWING +++ "+ex.toString());
	}
}
