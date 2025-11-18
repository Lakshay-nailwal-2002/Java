package com.lakshay.SpringAop.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TimerAspect {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Around("@annotation(com.lakshay.SpringAop.Annotation.TimeTrackingAnnotation)")
    public Object getExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long start = System.currentTimeMillis();

        // execute the method
        Object proceed = proceedingJoinPoint.proceed();

        long end = System.currentTimeMillis();

        log.info("Around aspect - {} Method executed in {} ms" , proceedingJoinPoint.getStaticPart() , end - start);

        return proceed;
    }

}
