package org.example.happy_practice;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
       ana();
        //System.out.println(res);

    }

    public static void ana() {

        String str1 = "hel";
        String str2 = "leh";
       char[] st1= str1.toCharArray();
       char[] st2= str2.toCharArray();
        char temp = 0; char temp1 = 0;
       for(int i=0;i<str1.length()-1;i++)
       {
            if(st1[i]>st1[i+1])
           {
                 temp=st1[i+1];
                  st1[i+1]=st1[i];
                  st1[i]=temp;
           }
       }
        for(int j=0;j<str2.length()-1;j++)
        {
            if(st2[j]>st2[j+1])
            {
                temp1=st2[j+1];
                st2[j+1]=st2[j];
                st2[j]=temp1;
            }
        }
        for(char c : st1)
        {
            System.out.println(c);
        }
        System.out.println("----------");
        for(char c : st2)
        {
            System.out.println(c);
        }



      boolean res=  Arrays.equals(st1,st2);
        System.out.println(res);


    }
}
