package org.example.challenge1.challenge2;

import java.util.Scanner;

public class delete_array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array elememts");
        for(int i =0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("--");
        System.out.println("enter the elemet");
        int ele =sc.nextInt();
        int count=0;
        //find that elemnent count and position
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                System.out.println("the position is"+ i);
                count++;
            }

        }
        System.out.println(count);
        int j=0;int i=0;
        int[] arr1=new int[arr.length-count];
        for( ;i<arr.length;i++)
        {

            if(arr[i]==ele) {

            }

            else{
                 for( ;j<arr.length;)
                {

                    arr1[j]=arr[i];


                    //System.out.println(arr1[j]);
                    j++;
                    break;

                }

            }
            }




        for(int k=0;k<arr1.length;k++)
        {
            System.out.print(arr1[k]);
        }



    }
}
