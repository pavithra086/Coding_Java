package org.example.happy_practice;

import java.util.Arrays;
import java.util.Scanner;

public class buble_sort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}