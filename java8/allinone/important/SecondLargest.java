package java8.allinone.important;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void main(String[] args) {
        int a[]={88,33,232,2332,233,44455};
        int secondLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] > largest)
            {

                secondLargest=largest;
                largest=a[i];

            }
            if (largest > a[i]) {
                secondLargest=largest;

            }

        }
        System.out.println("secondLargest = " + secondLargest);

        System.out.println(Arrays.stream(a)
                .distinct()
                        .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() ->new RuntimeException("no second largest")));







    }
}
