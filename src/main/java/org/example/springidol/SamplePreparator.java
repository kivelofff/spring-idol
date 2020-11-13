package org.example.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SamplePreparator {

    @Pointcut("execution(* org.example.springidol.Researcher.rsearch(String)) && args(sample)")
    public void rsearch(String sample) {

    }
    @Before("rsearch(sample)")
    public void samplePrep(String sample) {
        System.out.println("preparing sample: " + sample);
    }

}
