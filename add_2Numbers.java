package org.example;

import java.util.Scanner;

public class add_2Numbers {
    public int add(int a, int b)
    {
        int c= a+b;
        return c;
    }

    public static void main(String[] args) {
        add_2Numbers add= new add_2Numbers();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=add.add(a,b);
        System.out.println(res);

    }
}
