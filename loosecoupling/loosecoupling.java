package com.practice.javacodes.loosecoupling;

public class loosecoupling {
    public static void main(String args[])
    {
        car c=new car(new petroleng());
        c.move();
        car c1=new car(new deseng());
        c1.move();

    }
}
