package java8Features.lambda.streamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(21,55,43,23,1,5,6,7,8);

//        data.stream()
//                .filter(num -> num >10)
//                .sorted()
//                .forEach(System.out::println);

        //example 2
        data.stream()
                .map(num -> num / 2)
                .sorted()
                .forEach(System.out::println);

        

        
    }
}
