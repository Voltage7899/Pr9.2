package com.company;

public class VictorianChair implements Chair {
    int age;
    VictorianChair(int age)
    {
        this.age=age;
    }
    int getAge()
    {
        return age;
    }

    @Override
    public String toString() {
        return "VictorianChairs age is"+age;
    }
}
