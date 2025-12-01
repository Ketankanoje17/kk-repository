package PracticeJava_17;

import java.util.Arrays;
import java.util.List;

public class AdditionArr {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,3,2,3);
  int sum = 0;
        for(int data : numbers)
        {
          sum = sum +data;
        }
        System.out.println(sum);
    }
}
