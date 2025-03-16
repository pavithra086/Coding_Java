package CodingChallenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mergetwosortedarrays {
    public static void main(String[] args) {
        int[] arr={5,7,0,9,3};
        int[] arr2={9,3,2,1,0};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        Arrays.stream(arr);
        Arrays.stream(arr2);

        List<Integer> l= new ArrayList<>();
        for(int x : arr)
        {
            l.add(x);
        }
        for(int x: arr2)
        {
            l.add(x);
        }
        System.out.println(l);
        l.sort((a,b)->a-b);
        System.out.println(l);
        int[] arr9=  l.stream().mapToInt(x->x).toArray();

        for (int i = 0; i < arr9.length; i++) {
            System.out.println(arr9[i]);
        }


    }
}
