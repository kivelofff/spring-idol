package org.example.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class CleanerIntroducer {

    @DeclareParents(value = "org.example.springidol.Researcher+", defaultImpl = LabCleaner.class)
    public static Cleaner cleaner;
}
