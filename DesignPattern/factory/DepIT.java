package DesignPattern.factory;

public class DepIT implements DepartmentFactory{
    @Override
    public String subject() {
        return "IT department";
    }
}
