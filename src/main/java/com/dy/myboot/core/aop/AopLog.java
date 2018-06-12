package com.dy.myboot.core.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class AopLog {

    private static final Logger logger = LoggerFactory.getLogger(AopLog.class);

    @Pointcut("@annotation(com.dy.myboot.core.annotation.po.Log)")
    public void logMethod() {
    }

    @Before("logMethod()")
    public void openTra(JoinPoint joinPoint) throws ClassNotFoundException {

        String targetName = joinPoint.getTarget().getClass().getName();

        String name = joinPoint.getSignature().getName();

        Object[] arguments = joinPoint.getArgs();
        Class<?> targetClass = Class.forName(targetName);

        Method[] methods = targetClass.getMethods();

        String methodName = null;

        for (Method method : methods) {
            if (method.getName().equals(name)) {
                @SuppressWarnings("rawtypes")
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {

                    methodName = method.getAnnotation(com.dy.myboot.core.annotation.po.Log.class).action();

                    if (methodName.equals("null")) {
                        methodName = name;
                    }

                    break;
                }
            }
        }

        logger.info("/-----------" + methodName + "进栈/" + "\r\n\r\n args:" + JSON.toJSONString(arguments) + "\r\n");

    }

    @AfterReturning("logMethod()")
    public void cmmintTra(JoinPoint joinPoint) throws ClassNotFoundException {

        String targetName = joinPoint.getTarget().getClass().getName();

        String name = joinPoint.getSignature().getName();

        Object[] arguments = joinPoint.getArgs();
        Class<?> targetClass = Class.forName(targetName);

        Method[] methods = targetClass.getMethods();

        String methodName = null;

        for (Method method : methods) {
            if (method.getName().equals(name)) {
                @SuppressWarnings("rawtypes")
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {

                    methodName = method.getAnnotation(com.dy.myboot.core.annotation.po.Log.class).action();

                    if (methodName.equals("null")) {
                        methodName = name;
                    }

                    break;
                }
            }
        }

        logger.info("/-----------" + methodName + "出栈/" + "\r\n\r\n args:" + JSON.toJSONString(arguments) + "\r\n");


    }
}
