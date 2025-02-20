package org.example.challenge1.challenge2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum_Of_Array {
    public static void main(String[] args) {
        System.out.println("enter the array elements");
        int i =0;//index
        int[] arr = new int[5];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        while(i<arr.length)
        {
            arr[i]=sc.nextInt();
            i++;
        }


        System.out.println("----");
        //traverse and all add all elemnts
        int t =0;//index
        while(t< arr.length)
        {
           sum+=arr[t] ;
           t++;
        }
        System.out.println(sum);

    }
}
