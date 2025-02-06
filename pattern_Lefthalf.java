package org.example;

public class pattern_Lefthalf {
    public static void main(String[] args) {
        int n=5;int sp=1;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");

            }
            for(int k=0;k<sp;k++)
            {
                System.out.print("*");
            }
            sp++;

            System.out.println();
        }
    }
}
