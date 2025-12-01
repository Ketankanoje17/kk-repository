package comparablecompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String empName;

    public Employee(Integer id, String empName) {
        this.id = id;
        this.empName = empName;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id,o.id);
    }
    @Override
    public String toString() {
        return empName + " (" + id + ")";
    }

    public static void main(String[] args) {
        List<Employee> e1=new ArrayList<>();
        e1.add(new Employee(2,"ketan"));
        e1.add(new Employee(1,"manoj"));
        Collections.sort(e1);
        System.out.println("sorted is :"+e1);
    }
}
