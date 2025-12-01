package DesignPattern.factory;

public class MainFactory {
    public static void main(String[] args) {
        EmployeeFactory f=  FactoryDesignPattern.getEmp("Manager");

        System.out.println(f.salary());

    }
}
