package DesignPattern.factory;

import DesignPattern.factory.EmployeeFactory;

public class Manager implements EmployeeFactory {
    @Override
    public int salary() {
        return 5555;
    }
}
