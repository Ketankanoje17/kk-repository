package PracticeJava_17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondLargest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,44,333,232);
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int data : list)
        {
            if(largest < data)
            {
                secondLargest=largest;
                largest=data;
            }else if(largest > data){
                secondLargest=data;
            }
        }
        System.out.println(secondLargest);


        //
        Integer secondLargest1= list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLargest1);


    }
}
