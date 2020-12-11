package com.company;

public class Main {
    public static void main(String[] args)
    {
ChairFactory fac1=new ChairFactory();
Client client1=new Client();
client1.setChair(fac1.createMagicChair());
ChairFactory fac2=new ChairFactory();
Client client2=new Client();
client2.setChair(fac2.createVictorianChair(50));
ChairFactory fac3=new ChairFactory();
Client client3=new Client();
client3.setChair(fac3.createFunctionalChair(1,2));
        System.out.println(client1.chair);
        System.out.println(client2.chair);
        System.out.println(client3.chair);


    }
}
