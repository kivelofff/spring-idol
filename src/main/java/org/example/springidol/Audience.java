package org.example.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void showTickets() {
        System.out.println("people show their tickets");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("People came in and take seats");
            System.out.println("People turn of cell phones");
            long startTime = System.currentTimeMillis();
            joinPoint.proceed();
            long endTime = System.currentTimeMillis();
            System.out.println("CLAP CLAP");
            System.out.println("The performance took: " + (endTime-startTime) + " mils");

        } catch (Throwable e) {
            System.out.println("We want our money back!");
        }
    }

    public void leave() {
        System.out.println("people walk away");
    }
}
