package org.example.happy_practice;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        System.out.println("enter array");
        int[] arr = new int[5];int ele=9;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele)
            {
                System.out.printf("elementfounf in pos"+i);
            }
        }

        }
}
