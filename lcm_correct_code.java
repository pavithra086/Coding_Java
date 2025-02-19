package org.example.challenge1;

import java.util.Scanner;

public class lcm_correct_code {
    public static void main(String[] args) {
        System.out.println("Enter the first number ");
        Scanner sc= new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println("thank you for numbers the LCM of numbers"+ first +"and "+ second + "is");
        int lcm= lcm(first,second);
        System.out.println(lcm);

    }
    public static int lcm(int first, int second)
    {
        int i=1;
        while(true)
        {
            if(i%first==0 && i%second==0)
            {
               return i;
            }
            i++;
        }

    }
}
