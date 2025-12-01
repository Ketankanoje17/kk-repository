package java8.sort.secondLargest;


public class Employee {
   private  String name;
   private int rollNo;

    public Employee(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "EmployeeFactory{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
