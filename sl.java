package org.example.happy_practice;

import java.util.Scanner;

public class sl {
    public static void main(String[] args) {
        System.out.println("enter the array elements");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sl s = new sl();
        int res = s.secondlar(arr);
        System.out.println("+" + res);
    }

    public int secondlar(int[] arr) {
        int largest = arr[0];
        int seconlar = arr[0];
        int num;

        for (int i = 0; i < arr[i]; i++) {
            num = arr[i];
            //System.out.println("koo");
            if (num > largest) {
                seconlar = largest;
                largest = num;
            }


        }
        return seconlar;

    }
}