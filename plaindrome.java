package org.example.challenge1.challenge2;

import java.util.Scanner;

public class plaindrome {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr1= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=0;j<arr1.length;j++)
            {
                arr1[j]=arr[i];
                i--;
            }
        }
        for(int j=0;j<arr1.length;j++)
        {
            System.out.print(arr1[j]);
        }
        System.out.println();
        System.out.println("-----------");
        boolean palin=plaindrome(arr,arr1);
        if(palin==false) System.out.println("not plaindrome");
        else System.out.println("plaindrome");




    }
    public static boolean plaindrome(int[] arr,int[] arr1)

    {

        for(int i=0;i< arr.length;i++)
        {
            for(int k=0;k<arr1.length; k++)
            {
                //System.out.println(k);
                if(arr[i]!=arr1[k])
                {
                    return  false;
                }
                i++;
            }

        }
        return true;
    }
}
