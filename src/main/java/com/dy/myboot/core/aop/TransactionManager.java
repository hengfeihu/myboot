package com.dy.myboot.core.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class TransactionManager {

    private static final Logger logger = LoggerFactory.getLogger(TransactionManager.class);

    @Pointcut("@annotation(com.dy.myboot.core.annotation.po.TraMethod)")
    public void transactionMethod() {
    }

    @Before("transactionMethod()")
    public void openTra() {
        if (logger.isDebugEnabled()) {
            logger.debug("前置^^^事务开启");
        }
    }

    @AfterReturning("transactionMethod()")
    public void cmmintTra() {
        if (logger.isDebugEnabled()) {
            logger.debug("前置^^^事务提交");
        }
    }
}
