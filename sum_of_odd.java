package org.example.challenge1;

public class sum_of_odd {
    public static void main(String[] args) {
        int sum=sumofodd();
        System.out.println(sum);
    }

    public static int sumofodd()
    {   int i=1; int ll=1; int hl=5;int sum=0;int num=i;

            while( i%2!=0 && i<=hl ){
                sum=sum+i;
                i=i+2;
        }

        return sum;

    }
}
