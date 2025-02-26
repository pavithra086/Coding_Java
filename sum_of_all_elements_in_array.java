package org.example.happy_practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sum_of_all_elements_in_array {
    public static void main(String[] args) {
        sum_of_all_elements_in_array s = new sum_of_all_elements_in_array();
        System.out.println("enter the array elements");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int res =s.sumarray(arr);
        System.out.printf("the asum is %d",res);
    }

    public int sumarray(int[] arr)
    {int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
