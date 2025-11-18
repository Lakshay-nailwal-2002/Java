package com.lakshay.SpringAop.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private final Logger log = LoggerFactory.getLogger(getClass());

    //PointCut --> When ?
    @Before("execution(* com.lakshay.SpringAop.Service.*.*(..))")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        // Logic --> What ?
        log.info("Before Aspect Method is called - {}" , joinPoint);
    }

    @After("execution(* com.lakshay.SpringAop.Service.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        // Logic --> What ?
        log.info("After Aspect Method is called - {}" , joinPoint);
    }

    @AfterReturning("execution(* com.lakshay.SpringAop.Service.*.*(..))")
    public void logMethodCallAfterReturningExecution(JoinPoint joinPoint){
        // Logic --> What ?
        log.info("AfterReturning Aspect Method is called - {}" , joinPoint);
    }

    @AfterThrowing(
            pointcut = "execution(* com.lakshay.SpringAop.Service.*.*(..))",
            throwing = "exception"
    )
    public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint, Exception exception){
        // Logic --> What ?
        log.info("AfterThrowing Aspect Method is called - {}" , exception.toString());
    }

}
