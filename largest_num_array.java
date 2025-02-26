package org.example.happy_practice;

import java.util.Scanner;

public class largest_num_array {
    public static void main(String[] args) {
        largest_num_array l= new largest_num_array();
        System.out.println("enter the array elements");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res = l.largest(arr);
        System.out.println(res);
    }
    public int largest(int[] arr)
    {int largest=arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]>largest)
            {
                largest=arr[j];
            }

        }
        return largest;
    }

}
