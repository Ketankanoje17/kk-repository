package comparablecompartor.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> stud=new ArrayList<>();

        stud.add(new Student(5,"ketan","math"));
        stud.add(new Student(1,"sandesh","physics"));
        stud.add(new Student(3,"sidhesh","math"));
        stud.add(new Student(2,"manoj","math"));
        stud.add(new Student(4,"shailesh","python"));


        Collections.sort(stud,new NameSort());
        System.out.println(stud);





    }
}
