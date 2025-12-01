package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortedList {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,3,5);
        List<Integer> list2= Arrays.asList(2,4,6);

        List<Integer> sortedList= Stream.concat(list1.stream(),list2.stream())
                .sorted()//                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);
        sortedList.forEach(System.out::print);


    }
}
