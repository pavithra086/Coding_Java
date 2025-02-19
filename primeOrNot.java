package org.example.challenge1;

public class primeOrNot {
    public static void main(String[] args) {
        int num = 8;
        int res=prime();
        System.out.println(res);
        while(res==num)
        {
            System.out.println("prime");
            return;
        }

    }

    public static int prime() {
        int num = 8;
        int i = 2;
        while (i >=2 && i <num) {
            while (num%i== 0) {
                System.out.println("not prime");
                return i;
            }
            i++;

        }
        return i;

    }
}
