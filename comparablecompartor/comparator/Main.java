package comparablecompartor.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> ls=new ArrayList<>();
        ls.add(new Student(11));
        ls.add(new Student(55));
        ls.add(new Student(33));
        Collections.sort(ls,new AgeComparator());
        for(Student s1:ls)
        {
            System.out.println("sorting studen are : "+s1.getAge());
        }


    }
}
