package com.company;

public class MagicChair implements Chair {
    void doMagic()
    {
        System.out.println("Vzuh");
    }

    @Override
    public String toString() {
        return "MagicChair do magic";
    }
}
