package org.example.challenge1.challenge2;

import java.util.Scanner;

public class delete_ele_array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the ele");
        int ele=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]==ele)
            {
                while(i+1<arr.length)
                {
                    arr[i]=arr[i+1];
                    i++;
                }
                i++;
            }
        }

        System.out.println("---");
        for(int i=0;i<arr.length-2;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
