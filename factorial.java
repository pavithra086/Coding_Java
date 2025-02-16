package org.example.challenge1;

public class factorial {
    //3*2*1
    public static void main(String[] args) {
        int fact= factorial();
        System.out.println(fact);
    }
    public static int factorial()
    {
        int num =3; int fact=1;int i=1;
        while(i<=num)
        {
            fact =fact*i;
            i++;

        }

        return fact;
    }
}
