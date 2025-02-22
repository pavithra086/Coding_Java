package org.example.challenge3;

public class max_value_integerarray {
    public static void main(String[] args) {
        int[] arr= {2,4,9,02,6};
        max_value_integerarray m=new max_value_integerarray();
        int res= m.maxvalue(arr);
        System.out.println(res);

    }

    public int maxvalue(int[] arr)
    {
        int max =arr[0];
       for(int value : arr)
       {
           if(value>max)
           {
               max=value;

           }
           else {

           }

       }
       return max;
    }
}
