package CodingChallenge1;

import org.example.challenge1.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class prog1streams {
    //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        int[] arr = {9,7,4,2,1,8,6};

        for(int x:arr)
        {
            l.add(x);
        }
        List<Integer > l1= l.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(l1);
    }
}
