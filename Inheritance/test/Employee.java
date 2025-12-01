package Inheritance.test;

public class Employee {
    public String name;
    public String role;

    public String designation;

    public Double salary=1000.00;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary*10;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public Employee() {
        super();
    }

    public Employee(String name, String role, String designation, Double salary) {
        this.name = name;
        this.role = role;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
