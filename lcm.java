package org.example.challenge1;

public class lcm {
    public static void main(String[] args) {
        int a=20;int b=15;int i=2; int hl=b; int ll=a; int num=1;

           // System.out.println("k");
            while(i <= hl)
        {

            while (a % i == 0 && b % i == 0 && num < i && i <= hl) {
                System.out.println(i);
                num++;
            }
            i++;
            num++;
        }
        }
    }

