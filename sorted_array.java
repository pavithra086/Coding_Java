package org.example.challenge1.challenge2;

import java.util.Scanner;

public class sorted_array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("-----");
        boolean sorted = sorted(arr);
        System.out.println(sorted);
        if (sorted==true)
        {
            System.out.println("sorted");
        }
        else System.out.println("not sorted");
        //traverse
//        int t=1;int count=1;
//        while(t+1<arr.length )
//        {
//            if(arr[t]>arr[t+1])
//            {
//                count++;
//            }
//            t++;
//
//        }
//        System.out.println(count);
//        if(count+1==arr.length)
//        {
//            System.out.println("sorted");
//        }
//        else {
//            System.out.println("mot sorted");
//        }
//
//
//    }
//
    }
    public static boolean sorted(int[] arr)
    {
        int i=0;
        while(i+1<arr.length)
        {
            if(arr[i]>arr[i+1])
            {
               return false;
            }
            i++;
        }
      return true;
    }



}
