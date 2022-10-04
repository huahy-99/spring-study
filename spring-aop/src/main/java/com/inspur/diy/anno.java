package com.inspur.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class anno {

    @Before("execution(* com.inspur.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("执行方法前");
    }

    public void after() {
        System.out.println("执行方法后");
    }
}
