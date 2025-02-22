package org.example.challenge3;

import java.util.Scanner;

public class numberguessing_game {
    public static void main(String[] args) {
        int num;
        do {
            System.out.println("enter the number");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        } while (!numvalid(num));
    }
    public static boolean numvalid(int num)
    {
        if(num==9)
        {
            System.out.println("hurray you guessed it");
            return true;
        }
        else {
            return false;
        }
    }
}
