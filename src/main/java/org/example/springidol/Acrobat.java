package org.example.springidol;

public class Acrobat implements Performer{
    private int hobaAmount=1;

    public Acrobat(int hobaAmount) {
        this.hobaAmount = hobaAmount;
    }


    @Override
    public void perform() {
        System.out.println("Making " + hobaAmount + " hoba!");
    }
}
