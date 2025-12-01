package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.*;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> asList= Arrays.asList(1,56,23,11,21,11);
        //1
        List<Integer> printTheNumbers=asList.stream()
                .filter(numbers1 -> String.valueOf(numbers1).startsWith("1"))
                .toList();
        printTheNumbers.forEach(System.out::println);


       //2
        List<Integer> al=new ArrayList<>();
        for(int a:asList)
            {
                if(String.valueOf(a).startsWith("1"))
                {
                    al.add(a);
                }
            }

        System.out.print(al);
    }
}
