package CodingChallenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class prog2Streams {
   // Given a list of integers, find out all the numbers starting with 1 using Stream functions?

    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        int[] arr = {9,7,4,2,1,8,6,12,32,11,14,15};

        for(int x:arr)
        {
            l.add(x);
        }

        List<String> l1 = l.stream()
                                    .map(s->s+" ").filter(s-> s.startsWith("1")).collect(Collectors.toList());
        System.out.println(l1);
    }
}
