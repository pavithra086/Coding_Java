package org.example;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        if(num>0)
        {
            System.out.println("number is positive");
        }
        else {
            if(num ==0)
            {
                System.out.println("its zero");
            }
            else {
                System.out.println("-ve number");
            }
        }
    }
}
