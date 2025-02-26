package org.example.happy_practice;

public class fibbonaci {
    public static void main(String[] args) {
        int i=0; int j=1;int res=0;
        System.out.println(i);
        System.out.println(j);
        for(int k=0;res<15;k++)
        {
            res=i+j;
            System.out.println(res);
            i=j;
            j=res;
        }
    }
}
