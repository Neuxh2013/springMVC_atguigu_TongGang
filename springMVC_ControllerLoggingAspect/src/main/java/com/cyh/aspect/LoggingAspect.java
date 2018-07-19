package com.cyh.aspect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {


    public Object around(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        List<Object> argList = args == null ? new ArrayList<>() : Arrays.asList(args);
        System.err.println("方法 " + methodName + " 开始执行，参数 " + argList);
        Object result = null;
        try {
            result = joinPoint.proceed();
            System.err.println("方法 " + methodName + " 执行结束，返回值 " + result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return result;
    }


}
