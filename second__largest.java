package org.example.happy_practice;

public class second__largest {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        second__largest s= new second__largest();
       int res=  s.secondlaregst(arr);
        System.out.println(res);
    }
    public int secondlaregst(int[] arr)
    {
        int largest=0;int second_largest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest)
            {
                second_largest = largest;
                largest=arr[i];
            }


        }
        return second_largest;
    }
}
