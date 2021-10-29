package com.example.autotest.aspect2;

import com.example.autotest.aspect1.LogAspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SaveDtoAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("within(com.example.autotest.aspect2..*)")
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        try {
            result = point.proceed();
            System.out.println("拦截到了");

        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
