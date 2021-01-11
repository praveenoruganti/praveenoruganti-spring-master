package com.praveen.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {

	@Before("addEmployee()")
	public void logBefore(JoinPoint joinPoint) {

		System.out.print("logBefore() is running!");
		System.out.println(", before " + joinPoint.getSignature().getName() + " method");
		System.out.println("******");
	}

	@After("addEmployee()")
	public void logAfter(JoinPoint joinPoint) {

		System.out.print("logAfter() is running!");
		System.out.println(", after " + joinPoint.getSignature().getName() + " method");
		System.out.println("******");
	}

	@AfterReturning(pointcut = "addEmployee()", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {

		System.out.print("logAfterReturning() is running!");
		System.out.println(", after " + joinPoint.getSignature().getName() + " method");
		System.out.println("Method returned value is = " + result);
		System.out.println("******");
	}

	@AfterThrowing(pointcut = "addEmployee()", throwing = "exception")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {

		System.out.print("logAfterThrowing() is running!");
		System.out.println(", after " + joinPoint.getSignature().getName() + " method throwing exception");
		System.out.println("exception = " + exception);
		System.out.println("******");
	}

	@Pointcut("execution(* com.praveen.spring.aop.service.EmployeeService.addEmployee())")
	public void addEmployee() {
	}

	@Around("execution(* com.praveen.spring.aop.service.EmployeeService.modifyEmployee())")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Advice Initial message");
		pjp.proceed();
		System.out.println("Around Advice later message");

	}

}
