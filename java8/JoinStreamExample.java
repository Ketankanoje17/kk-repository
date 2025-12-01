package java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinStreamExample {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,4);
        List<Integer> list2= Arrays.asList(5,6,7);


       Stream<Integer> combined = Stream.concat(list1.stream(),list2.stream());
        System.out.println(" "+combined);
       combined.forEach(System.out::println);


    }
}
