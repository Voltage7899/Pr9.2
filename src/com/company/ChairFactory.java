package com.company;

public class ChairFactory implements AbstractChairFactory {


    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair(int a,int b) {
        return new FunctionalChair(a,b);
    }
}
