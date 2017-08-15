package net.thinkmar.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
	
	@Before("execution(* *.*(..))")
	public void logBefore(JoinPoint jionPoint){
		System.out.println("Log:"+jionPoint.getTarget().getClass().getName()+"."+jionPoint.getSignature().getName()+" method start.");
	}
	
	@After("execution(* *.*(..))")
	public void logAfter(JoinPoint jionPoint){
		System.out.println("Log:"+jionPoint.getTarget().getClass().getName()+"."+jionPoint.getSignature().getName()+" method end.");
	}
}
