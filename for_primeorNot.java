package org.example.challenge3;

import java.util.Scanner;

public class for_primeorNot {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for_primeorNot p=new for_primeorNot();
        boolean res=p.primeornot(n);
        System.out.println(res);

    }

    public boolean primeornot(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(i%num==0)
            {
                return false;
            }
        }
        return true;
    }
}
