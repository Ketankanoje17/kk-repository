package DesignPattern.factory;

public class DepMech implements DepartmentFactory{
    @Override
    public String subject() {
        return "Mechanical";
    }
}
