package org.example.challenge1;

public class sumofdigits {
    public static void main(String[] args) {
        //148=1+4+8=13
        //1111111
        int num=1111111;int i=0;int rem =0;int temp=rem;
        while(num>0) {
            rem = num % 10;//8
            num=num/10;//14
            temp=temp+rem;

        }
        System.out.println(temp);
    }
}
