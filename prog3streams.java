package CodingChallenge1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class prog3streams {
    public static void main(String[] args) {
        //How to find duplicate elements in a given integers list in java using Stream functions?

        List<Integer> l= new ArrayList<>();
        int[] arr = {9,7,4,2,1,8,6,8,4};

        for(int x:arr)
        {
            l.add(x);
        }

       // List<Integer> l1= l.stream().distinct().collect(Collectors.toList());
      //  System.out.println(l1);
        Set<Integer> s= new HashSet<>();

       l.stream().filter(x->!s.add(x)).forEach(x-> System.out.println(x));

    }
}
