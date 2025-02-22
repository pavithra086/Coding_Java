package org.example.challenge3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class password_checker {
    public static void main(String[] args) {
        password_checker p=new password_checker();
        p.passcheck();

    }

    public void passcheck() {
        String pass;String password="hello9";
        do {
            System.out.println("enter the password");
            Scanner sc = new Scanner(System.in);
            pass = sc.nextLine();

        } while (!pass.equals(password));

    }
}
