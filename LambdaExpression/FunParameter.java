package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunParameter {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,22,44,23,2);

        al.forEach(n ->{
            if(n % 2 == 0)
            {
                System.out.println(n);
            }
        });

    }
}
