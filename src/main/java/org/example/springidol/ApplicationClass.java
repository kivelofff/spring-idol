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

        Performer acrobat = (Performer) context.getBean("hobodel");
        acrobat.perform();
        Researcher acrobatResearcher = (Researcher) context.getBean("hobodel");
        acrobatResearcher.rsearch("sample1");

        Researcher researcher = (Researcher) context.getBean("stupid-laborant");
        researcher.rsearch("sample2");

        Cleaner poorResearcher = (Cleaner) context.getBean("stupid-laborant");
        poorResearcher.clean();
    }


}
