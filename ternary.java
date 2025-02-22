package org.example.challenge3;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String res2 =score<50?"low":"invalid";
        String res1 = score < 80 && score > 50?"moderate": res2;
        String res = score > 80 ? "high" : res1;

        System.out.println(res);
    }
}
