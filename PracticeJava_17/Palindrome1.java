package PracticeJava_17;

import multipleinheritance.Scanner;

import java.util.Arrays;
import java.util.List;

public class Palindrome1 {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(11,54,44,2233,22);
        int count = 0;
       for(int numbers:data)
       {
          int original=numbers;
           int rev = 0;
           while(numbers > 0)
           {
               int rem = numbers % 10;
               rev= rev*10+rem;
               numbers = numbers / 10;


           }

           if(original == rev)
           {
               count++;
           }
       }

        System.out.println(count);
    }
}
