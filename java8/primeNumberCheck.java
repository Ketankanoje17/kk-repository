package java8;

import java.util.Arrays;
import java.util.List;

public class primeNumberCheck {
    public static void main(String[] args) {
        List<Integer> primeNumberCheck= Arrays.asList(4,5,6,11,12);
        boolean containsPrime=primeNumberCheck.stream().anyMatch(java8.primeNumberCheck::isPrime);
        System.out.println("Arraylist contains prime numbers "+containsPrime);
    }
    public static boolean isPrime(int num)
    {
        if(num <=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return  true;
    }
}
