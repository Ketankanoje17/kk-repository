package DesignPattern.factory;

public class FactoryDesignPattern {

    public static EmployeeFactory getEmp(String empType)
    {
        if(empType.trim().equalsIgnoreCase("Developer")) {
            return new Developer();
        } else if (empType.trim().equalsIgnoreCase("Manager")) {
            return new Manager();

        }else {
            return null;
        }
    }
}
