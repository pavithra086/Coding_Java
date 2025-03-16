package CodingChallenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class SubArraySum {
    //you will have array
    //take a sub array from it
    //sum of elemts in sum array
    public static void main(String[] args) {
        int[] arr  ={4,7,0,2,1,9,6,3,2,0,5};
        List<Integer> list1= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        System.out.println(list1);
        List<Integer> list2=  list1.subList(3,8);
        System.out.println("the sublist is "+ list2);

       int arr2[]= list2.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        int sum=0;
        for(int i=0;i< arr2.length;i++)
        {
            sum= sum + arr2[i];
        }
        System.out.println(sum);














    }
}
