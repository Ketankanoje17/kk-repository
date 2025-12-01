package java2102025;

import java.util.Arrays;
import java.util.HashSet;

public class UniquearrayNumbers {

    public static void main(String[] args) {
        int arr[]={33,22,11,34,33};

        HashSet<Integer> a=new HashSet<>();

        for(int numbers: arr)
        {
            a.add(numbers);
        }
        System.out.println(a);
    }
}
