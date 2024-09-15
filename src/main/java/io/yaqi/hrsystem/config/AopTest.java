package io.yaqi.hrsystem.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author chenyaqi
 * @Description AOP测试配置类 面向切面编程
 * @Date 2024/9/13 15:20
 * @Param
 **/

@Slf4j
@Component
@Aspect
public class AopTest {

    @Pointcut("execution(public * io.yaqi.hrsystem.controller..*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        log.info("这是{}的before", joinPoint.getSignature().getName());
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        log.info("这是{}的after", joinPoint.getSignature().getName());
    }

//    @Around("pointCut()")
//    public Object around() {
//        log.info("这似乎aop的around");
//        return null;
//    }
}
