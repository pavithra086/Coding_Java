package com.practice.javacodes.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist<I extends Number> {
    public static void main(String[] args) {
        LinkedList<String> l= new LinkedList<String>();
        l.add("hi");
        l.add("hello");
        System.out.println(l);
        LinkedList<Integer> k=new LinkedList<Integer>();
        k.add(1);
        k.add(2);
        l.add(1,String.valueOf(k));
        System.out.println(l);
        l.addFirst("o");
        System.out.println(l);
        boolean a= l.contains("o");
        System.out.println(a);
        System.out.println("-----------");
        Iterator<String> it=l.descendingIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        l.removeFirstOccurrence("o");
        System.out.println(l);

        Object[] h = l.toArray();
        for(Object element :h)
        {
            System.out.println(element);
        }
    }


}
