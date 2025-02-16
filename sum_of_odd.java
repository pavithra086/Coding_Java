package org.example.challenge1;

public class sum_of_odd {
    public static void main(String[] args) {
        int sum=sumofodd();
        System.out.println(sum);
    }

    public static int sumofodd()
    {   int i=2; int ll=1; int hl=7;int sum=1;int num=i;
        while(i<=hl )
        {

            while( i%2!=0 && i<=hl ){
                sum=sum+i;
                i++;


        }
           i++;
        }
        return sum;
    }
}
