package org.example.challenge1;

public class armstrong {
    public static void main(String[] args) {
    int res=armstrong();
    int num=153;

    System.out.println(res);
    if(res==num)
    {
        System.out.println("armstrong");
    }
    }

    public static int armstrong()
    {
        int num=153;int num1=0;int num4=0;
        while(num>=1)
        {
            num1=num%10;
            num=num/10;

            num4=num4+num1*num1*num1;

        }


        return num4;
    }
    }

