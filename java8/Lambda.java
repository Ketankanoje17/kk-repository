package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
       List<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(30);
        al.add(20);
        al.add(71);

//        List<Integer> al= Arrays.asList()
        System.out.println("collection list is : "+al);
        List<Integer> ls=al.stream()
                .filter(i -> i % 2 == 0)
                .map(num -> num * 2)
                .toList();
        ls.forEach(System.out::println);
        System.out.println("collected stream :"+ls);
    }
}
