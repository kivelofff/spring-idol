package org.example.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class ScientificBoss {
    @Pointcut("execution(* org.example.springidol.Researcher.rsearch(..))")
    public void r() {

    }

    @Before("r()")
    public void askingResults() {
        System.out.println("Boss: Where is the results? I'm waiting");
    }

    @AfterReturning("r()")
    public void gettingResults() {
        System.out.println("Boss: You are stupid laborant! But it's ok!");
    }

    @AfterThrowing("r()")
    public void makingParenting() {
        System.out.println("Boss: You are stupid laborant! Remake it!");
    }

    @Around("r()")
    public void makingFuss(ProceedingJoinPoint joinPoint) {

        try {
            System.out.println("Boss: I'm waiting");
            joinPoint.proceed();
            System.out.println("Boss: Are you stupid?");
        } catch (Throwable throwable) {
            System.out.println("Boss: You are stupid laborant! Remake it!");
        }

    }

}
