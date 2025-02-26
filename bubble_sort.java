package org.example.happy_practice;

import java.util.Arrays;
import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        System.out.println("enter array");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        sort(arr);
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
    public static int[] sort(int[] arr)
    {   int i =0;int j=1;int temp=0;
        for (int k = 0; k< arr.length ; k++) {

            for (int l = 0; l <arr.length ; l++) {
                if(arr[k]<arr[l]) {
                    temp = arr[k];
                    arr[k] = arr[l];
                    arr[l] = temp;

            }
            }


        }
        return arr;
    }

}
