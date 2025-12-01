package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30, 20, 50);

        List<Integer> data = list1.stream()
                .filter(n -> n >= 20)
                .map(n -> n * 10)
                .distinct()
                .sorted()

                .collect(Collectors.toList());

        data.forEach(System.out::println);


    }
}
