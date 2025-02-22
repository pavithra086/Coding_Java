package org.example.challenge3;

public class foreachtoget_occurance {
    public static void main(String[] args) {
        int[] arr= {0,5,2,0,8,5,0};
        int ele=0;
        foreachtoget_occurance f=new foreachtoget_occurance();
       int res= f.occrance(arr,0);
        System.out.println(res);
    }
    public int occrance(int[] arr, int ele)
    {
        int count =0;
        for(int value:arr)
        {
            if(value==ele)
            {
                count++;
            }

        }
        return count;
    }
}
