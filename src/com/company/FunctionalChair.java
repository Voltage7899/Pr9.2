package com.company;

public class FunctionalChair implements Chair {
    int sum;
public FunctionalChair(int a,int b)
{
    this.sum=a+b;
}






    @Override
    public String toString() {
        return "Sum of FuncChair is"+sum;
    }
}
