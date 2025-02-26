package org.example.happy_practice;

import java.util.Arrays;
import java.util.Scanner;

public class bs {
    public static void main(String[] args) {
        System.out.println("enter the array");
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("the entered array is");
        for(int num :arr)
        {
            System.out.print(" "+num);
        }
        System.out.println();
        System.out.println("enter the element to be searched");
        int ele= sc.nextInt();
        bsearch(arr,ele);


    }
    public static int bsearch(int[] arr, int ele)
    {
        Arrays.sort(arr);
        System.out.println("array after sorting ");
        for(int num :arr)
        {
            System.out.print(" "+num);
        }
        System.out.println();
        int middle= arr.length/2;
        System.out.println("the middle element is"+arr[middle]);
        System.out.println("the position is "+middle);
        if(ele==arr[middle])
        {
            System.out.println("the element is found in possition"+middle);
        }
        if(ele>arr[middle])
        {

            System.out.println("greater");

            int start= middle+1; int end= arr.length;
            while(end>start) {


                int rem = arr.length - start;
                System.out.println("the remaining elements are" + rem);
                int mid = rem / 2;
                mid = start + mid;
                System.out.println("the mid elemnt after is " + mid + " " + arr[mid]);
                if(ele==arr[mid])
                {
                    System.out.println("the element is found in possition"+mid);
                }
                if(ele<arr[mid])
                {
                    int start1= 0; int end1= middle-1;
                    int rem1 = end1-start1;
                    System.out.println("the remaining elements are" + rem1);
                    int mid1 = rem1 / 2;

                    System.out.println("the mid elemnt after is " + mid1 + " " + arr[mid1]);
                    if(ele==arr[mid1])
                    {
                        System.out.println("the element is found in possition"+mid1);
                    }
                }

            }


        }
        if(ele<arr[middle])
        {
            System.out.println("lesser");
        }
        return 0;
    }
}
