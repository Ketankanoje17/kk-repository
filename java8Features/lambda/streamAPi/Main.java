package java8Features.lambda.streamAPi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> a=new ArrayList<>();
        a.add(new Student(23,"SANDESH","MECHANICAL"));
        a.add(new Student(11,"ketan","IT"));
        a.add(new Student(78,"VISHAL","COMPUTER"));
        a.add(new Student(1,"VISHAL","COMPUTER"));


     List<Student> list =   a.stream()
                .sorted(Comparator.comparing(Student :: getDepartment))
                .collect(Collectors.toList());

             list.forEach(System.out::println);


    }
}
