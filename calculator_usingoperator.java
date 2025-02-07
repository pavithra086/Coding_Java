package org.example;

import java.util.Scanner;

public class calculator_usingoperator {
    public static void main(String[] args) {
        System.out.println("enter two numbers:");
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        int b= inp.nextInt();
        System.out.println("division is: " +(a/b));
        System.out.println("multiplication is :"+(a*b));
        System.out.println("addition is :"+(a+b));
        System.out.println("subtraction is "+(a-b));
        System.out.println("modulous is"+(a%b));
    }
}
