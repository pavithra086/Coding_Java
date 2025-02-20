package org.example.challenge1.challenge2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class occurance_element {
    public static void main(String[] args) {
        int[] arr= new int[7];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the elemnt to search");
        int ele =sc.nextInt();
        int t=0;
        int count=0;
        while(t< arr.length)
        {
            if(arr[t]==ele)
            {
                count++;
            }
            t++;
        }
        System.out.println(count);
    }
}
