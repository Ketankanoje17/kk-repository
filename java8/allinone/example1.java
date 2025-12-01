package java8.allinone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class example1 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(11,34,32,33,33,23,23,4,23,6,565,344,-1,0);
        List<Integer> list2= Arrays.asList(11,34,32,700);

        int arr[]={3,45,43,23,21};
        List<Integer> data= Arrays.stream(arr)
                        .filter(i->i/3==0)
                                .boxed()
                                        .collect(Collectors.toList());

        System.out.println("data = " + data);

        System.out.println("common elelemnt : " +list.stream().filter(list2 ::contains).toList());

        List<Integer> number =  list.stream()
                .filter(i -> i %2 == 0)
                .toList();


        System.out.println("even number = " + number);
        List<Integer> odd =  list.stream()
                .filter(i -> i %2 != 0)
                .toList();

        System.out.println("odd number = " + odd);

        List<Integer>  gratestAll50 =list.stream()
                .filter(i -> i > 30)
                .collect(Collectors.toList());

        System.out.println("gratestAll50 = " + gratestAll50);
        
        List<Integer> squres=list.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println("squres = " + squres);

        System.out.println("count greater than 10  :"+list.stream().filter(i -> i > 4).count());
        System.out.println("sorted number is default :"+list.stream().sorted().toList());
        System.out.println("sorted Descending number is default :"+list.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println("unique data :"+list.stream().distinct().toList());

        System.out.println("maximum number is : "+list.stream().max(Integer :: compare).get());
        System.out.println("minimum number is : "+list.stream().min(Integer :: compare).get());

        System.out.println("LIMIT  is : "+list.stream().limit(5).toList());

        System.out.println("LIMIT  is : "+list.stream().skip(5).toList());

        System.out.println("All Match   is : "+list.stream().allMatch(i -> i > 0));

        System.out.println("any Match   is : "+list.stream().anyMatch(i -> i < 0));

        System.out.println("First element   is : "+list.stream().findFirst().get());

        System.out.println("second higehst  is : "+list.stream().
                        distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow());


        System.out.println("second lowest  is : "+list.stream().
                distinct().sorted().skip(1).findFirst().orElseThrow());










        List<String> DATA =Arrays.asList("ketan","vishal,MANOJ");
       List<String> capital = DATA.stream()

               .map(s -> s.toUpperCase()) //  same as this is short form
                                           // .map(String :: toUpperCase)
                .collect(Collectors.toList());

        System.out.println("capital = " + capital);









    }

}
