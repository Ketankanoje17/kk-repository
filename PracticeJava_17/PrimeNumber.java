package PracticeJava_17;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(122,444,23,32,76,4);
        int count = 0;
        for(int num :data) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if(num % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                    System.out.println("count is "+count+ " and number is "+num);

                }
            }
        }
    }
}
