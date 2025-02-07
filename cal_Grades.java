package org.example;

import java.util.Scanner;

public class cal_Grades {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a>90) System.out.println("A");
        else if(a>60) System.out.println("B");
        else if(a>30) System.out.println("D");

    }
}
