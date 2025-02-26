package org.example.happy_practice;

import java.util.Scanner;

public class second_largest_array {
    public static void main(String[] args) {
        System.out.println("enter the array elements");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        second_largest_array s = new second_largest_array();
     int res=   s.secondlar(arr);
        System.out.println(res);

    }
    public int secondlar(int[] arr)
    {int largest=arr[0];int j=0;
        int[] arr1 = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }

        }

        for(int i=0;i< arr.length;i++) {

            if (arr[i] == largest) {



            } else {

                arr1[j] = arr[i];
                j++;
            }
        }

        int selargest=arr[0];
        for (int i = 0; i < arr1.length; i++) {
           if(arr1[i]>selargest)
            {
                selargest=arr1[i];
            }
        }

        return selargest;
    }
}
