package com.praveen.aop.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class ExecutionTimeTrackerAdvice {

	Logger logger = Logger.getLogger(ExecutionTimeTrackerAdvice.class);

	@Around("@annotation(com.praveen.aop.advice.TrackExecutionTime)")
	public Object trackTime(ProceedingJoinPoint pjp) throws Throwable {
		long stratTime = System.currentTimeMillis();
		Object obj = pjp.proceed();
		long endTime = System.currentTimeMillis();
		logger.info("Method name" + pjp.getSignature() + " time taken to execute : " + (endTime - stratTime));
		return obj;
	}

}
