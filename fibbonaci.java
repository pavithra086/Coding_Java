package org.example.challenge1;

public class fibbonaci {
    public static void main(String[] args) {
    int res= fibbo();
    }
    public static int fibbo()
    {
       int num1=0;int num2=1;int num3=0;int limit =200;
       while(num1+num2<limit )
       {
           num3=num2+num1;

           num1=num2;
           num2=num3;

               System.out.println(num3);



       }
       return 0;
    }
}
