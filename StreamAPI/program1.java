package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class program1 {
    public static void main(String[] args) {
        List<String> a= Arrays.asList("ketan","manoj","sanket","sanjay,surya");
        System.out.println(a);
        List<Integer> b=List.of(2,5,32,232,11);
        System.out.println(b);
        List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(122);
        list.add(3333);
        list.add(6);
        System.out.println(list);
        List<Integer> list2=new ArrayList<>();
//normal
        for(Integer c:list)
        {
            if(c % 2 == 0)
            {
                list2.add(c);
            }
        }
//stream api
        System.out.println(list2);

//      Stream<Integer> stream =  list.stream();
//   List<Integer> newList =   stream.filter(i -> i%2==0).collect(Collectors.toList());  //predicate function add
//        System.out.println(newList); i -> i % 2

       List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
   }

//filter if expression true then return value

}
