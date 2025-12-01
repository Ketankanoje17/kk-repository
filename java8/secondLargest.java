package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={23,11,55,22,12};
      int secondLargest1 =  secondLargest(arr);
        System.out.println(secondLargest1);

        Integer secondLargest= Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLargest);


        //2

    }

    public static int secondLargest(int[] num)
    {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++)
        {
            int numLen=num[i];

            if(largest < numLen)
            {
                secondLargest=largest;
                largest=numLen;
            } else if ( numLen > secondLargest) {
                 secondLargest=numLen;
            }
        }

        return secondLargest;
    }


}
