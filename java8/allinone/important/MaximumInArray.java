package java8.allinone.important;

import java.util.Arrays;
import java.util.List;

public class MaximumInArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(77,33,22,12,555);
        int largest=Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        System.out.println(minimum);
        for(int data:list)
        {
            if(data > largest)
            {
                largest=data;
            }
                if (data < minimum) {
                minimum=data;
            }
        }
        System.out.println("largest and minimum is = " + largest + " minimum "+minimum);

        System.out.println(list.stream().max(Integer::compareTo).orElseThrow());
    }
}
