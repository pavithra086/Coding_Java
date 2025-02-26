package org.example.happy_practice;

import java.util.Scanner;

public class merge_two_array {
    public static void main(String[] args) {
        System.out.println("enter two array");
        Scanner sc = new Scanner(System.in);
        int[] arr2= new int[5];
        int[] arr1=new int[5];
        for (int i = 0; i < arr1.length; i++) {

            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {

            arr2[i]=sc.nextInt();
        }
        merge_two_array m=new merge_two_array();
       int[] res= m.merge(arr1,arr2);

        for(int num :res)
        {
            System.out.println(" " +num);
        }
    }
    public int[] merge(int[] arr1,int[] arr2)
    {
        int[] res = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++)
        {
            res[i]=arr1[i];
        }
        int j=0;
        for(int i=arr1.length;i<res.length;i++)
        {
            res[i]=arr2[j];
            j++;
        }
        return res;
    }
}
