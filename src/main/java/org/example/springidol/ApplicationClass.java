package org.example.springidol;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Performer performer = (Performer) context.getBean("hulio");
        performer.perform();

        Thinker thinker = (Thinker) context.getBean("noob");
        MindCapturer mc = (MindCapturer) context.getBean("gudini");

        thinker.thinkOfSomething("blat");
        System.out.println("Checking volunteer: " + thinker.getThoughts());
    }


}
