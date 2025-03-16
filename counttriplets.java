package CodingChallenge1;

import org.example.countletters;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class counttriplets  {
    // 6 7 9 6 0 6
    public static void main(String[] args) {
        int[] arr= {6,9,6,9,6,9,8,5};
        List<Integer>m= new ArrayList<>();
        for(int x: arr)
        {
            m.add(x);
        }

       Map<Integer,Long> map = m.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);





        List<Integer> l= map.entrySet().stream().filter(x->x.getValue()==3).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(l);











    }


}
