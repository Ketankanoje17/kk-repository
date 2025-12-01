package comparablecompartor;

import comparablecompartor.comparator.Student;
import comparablecompartor.comparator.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> sd=new ArrayList<>();
        sd.add(new Student("ketan",11));
        sd.add(new Student("manoj",7));
        sd.add(new Student("suraj",13));
        sd.add(new Student("sanjay",4));

        Collections.sort(sd,new StudentComparator());
        for(Student s1:sd)
        {
            System.out.println("sorting studen are : "+s1.getName()+" and roll no is : "+s1.getRollNo());
        }



    }
}
