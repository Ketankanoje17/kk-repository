package java8.sort.secondLargest;

import java8.sort.secondLargest.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortMain {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("ketan"));
        list.add(new Employee("ashok"));
        list.add(new Employee("kanoje"));


//        Employee e1 = new Employee();
//        e1.setName("ketan");
//
//        Employee e2 = new Employee();
//        e2.setName("aanoje");
//
//        Employee e3 = new Employee();
//        e3.setName("suraj");

//        list.add(e1);
//        list.add(e2);
//        list.add(e3);

        System.out.println("Original List: " + list);

        List<Employee> data = list.stream()
                .distinct() // works only if equals() and hashCode() are implemented
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println("Sorted List: " + data);
    }
}