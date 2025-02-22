package org.example.challenge3;

public class sum_of_positivenumbers_using_continue {
    public static void main(String[] args) {
      sum_of_positivenumbers_using_continue s=new sum_of_positivenumbers_using_continue();
      int res= s.sum(5);
        System.out.println(res);
    }
    public int sum(int limit)
    { int summ=0;
        for(int i=0;i<5;i++)
        {
           if(i%2!=0)
           {
               continue;

           }
           else {
               summ+=i;
           }
        }
        return summ;

    }
}
