package org.example.challenge3;

import java.util.Scanner;

public class break_if_exit_is_entered {
    public static void main(String[] args) {
        String s="exit";
        do {
            System.out.println("enter a string");
            Scanner sc = new Scanner(System.in);
            String inp = sc.nextLine();

            if (inp.equals(s)) {
                break;
            }
        }
            while (true) ;


        }
    }
