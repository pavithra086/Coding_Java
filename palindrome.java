package org.example.challenge1;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class palindrome {
    public static void main(String[] args) {
        int num=121;
        int res=palindrome();
        System.out.println(res);
    }

    public static int palindrome()
    {
        int num=121;int num1=0;
        while(num>=1)
        {
            num1=num%10;
            num=num/10;




        }


        return num1;

    }
    }

