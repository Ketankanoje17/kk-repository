package DesignPattern.factory;

import DesignPattern.factory.EmployeeFactory;

public class Developer implements EmployeeFactory {
    @Override
    public int salary() {
        return 1111;
    }
}
