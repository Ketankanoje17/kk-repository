package Inheritance;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Helper {
    public static void main(String[] args) {

        Employee e=new Developer(1,"nayana",1111,"full stack developer");
        Employee e1=new Manager(1,"ketan",7777,10);
        List<Employee> list= Arrays.asList(e,e1);
        System.out.println(list);
        for(Employee data:list)
        {
         data.displayInfo();
         System.out.println("Bonus is : "+data.calculateBonus());
         System.out.println();
        }
        Collections.sort(list, Comparator.comparingDouble(emp  -> emp.salary));
        System.out.println("sorted by salary ascending");
        list.forEach(System.out::println);



    }
}
