package java8;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseString18 {
    public static void main(String[] args) {
        String word="hello world";

       String data = word.chars()
               .mapToObj(c -> (char) c)
               .sorted(Comparator.reverseOrder())
               .map(String::valueOf)
               .collect(Collectors.toList()).toString();


        System.out.println(data);
    }
}
