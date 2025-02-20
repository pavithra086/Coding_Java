package org.example.challenge1.challenge2;

import java.util.Scanner;

public class merge_arrays {
    //merge two soted array
    public static void main(String[] args) {
        int[] arr=new int[5];
        int[] arr1= new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i< arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        //merge two array
        int[] arr2=new int[arr.length+ arr1.length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                arr2[j]=arr[i];
                i++;
            }

        }

        //System.out.println(arr.length);
        int falg = arr.length;

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=falg;j<arr2.length;j++)
            {
                arr2[j]=arr1[i];
                i++;
            }
        }

        for(int i=0;i<arr2.length;i++)
        {

            System.out.println(arr2[i]);
        }




    }
}
