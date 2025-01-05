package com.practice.javacodes.collections;

import java.util.*;

public class set
{
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        s.add(6);
        s.add(90);
        s.add(-7);
        System.out.println(s);

        Iterator<Integer> val= s.iterator();
        while( val.hasNext())
        {
            System.out.println(val.next());
        }
    }
}

