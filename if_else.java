package org.example;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean input= sc.nextBoolean();
        if(input)
        {
            System.out.println("hello");
        }
        else
        {
            System.out.println("no hello");
        }
    }
}
