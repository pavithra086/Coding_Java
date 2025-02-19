package org.example.challenge1;

public class gcd {
    public static void main(String[] args) {
        int var = gcd();
        System.out.println(var);
    }

    public static int gcd() {
        int a = 5;
        int b = 7;
        int i = b;
        int hl = b;
        int ll = a;
        int num = 1;
        while (i <= hl && i > 0) {
            // System.out.println("k");

            while (a % i == 0 && b % i == 0) {
                return i;
                // num++;
            }
            i--;

        }
        return i;

    }


}