package org.example.springidol;

public class Magician implements MindCapturer {
    @Override
    public void captureThoughts(String thoughts) {
        System.out.println("Capturing....");
        System.out.println(thoughts);
    }
}
