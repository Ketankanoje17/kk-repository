package DesignPattern.factory;

public class DepartmentMain {
    public static void main(String[] args) {
        DepartmentFactory factory=DepartmentMainFactory.getSubject("IT");
        System.out.println(factory.subject());
    }
}
