package org.example.challenge1.challenge2;

import java.util.Scanner;

public class min_max_ele_array {
    public static void main(String[] args) {
        System.out.println("enter the array elemtns ");
        int[] arr= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min= min(arr);
        int max= max(arr);
        System.out.println("max is"+ max);
        System.out.println("min is"+min);


    }

    public static int min(int[] arr)
    {
      int i=0;int min=arr[0];
      while(i<arr.length)
      {
          if(arr[i]<min)
          {
              min=arr[i];
          }
          i++;
      }
      return min;
    }

    public static int max(int[] arr)
    {
        int t=0;int max= arr[0];
        while (t<arr.length)
        {
            if(arr[t]>max)
            {
                max=arr[t];
            }
            t++;

        }
        return max;
    }
}
