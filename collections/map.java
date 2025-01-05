package com.practice.javacodes.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        Map<Integer,Integer> st=new TreeMap<>();

        int arr[]={1,-9,8,7};

        for(int x:arr)
        {
            st.put(x,x);
        }
        System.out.println("----------");
        for(Object ey: st.keySet())
        {
            System.out.println(ey );
        }


    }
}
