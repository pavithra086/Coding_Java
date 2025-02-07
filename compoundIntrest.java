package org.example;

import java.util.Scanner;

public class compoundIntrest {
    public static void main(String[] args) {
        System.out.println("enter pri, rate , time");
        Scanner inp= new Scanner(System.in);
        int time =inp.nextInt();
        int pri= inp.nextInt();
        float rate= inp.nextFloat();
        System.out.println("the compound intrest is"+((pri*(1+rate)/100)));
    }
}
