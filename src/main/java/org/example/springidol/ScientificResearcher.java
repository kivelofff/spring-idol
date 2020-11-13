package org.example.springidol;

public class ScientificResearcher implements Researcher{

    @Override
    public void rsearch(String sample) {
        System.out.println("Providing scientific results based on sample: " + sample);
    }
}
