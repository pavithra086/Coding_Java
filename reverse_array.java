package org.example.challenge1.challenge2;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        int [] arr= new int[6];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //System.out.println(arr.length);
        int[] arr1=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--)
        {
           for(int j=0;j<arr1.length;j++)
           {

               arr1[j]=arr[i];
               i--;

           }
        }

        System.out.println("------");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]);
        }


    }
}
