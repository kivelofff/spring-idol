package org.example.springidol;

public class Volunteer implements Thinker{
    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
        System.out.println("Thouths thout!");
    }

    public String getThoughts() {
        return thoughts;
    }
}
