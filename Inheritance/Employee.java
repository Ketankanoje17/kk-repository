package Inheritance;

public class Employee {
   public int id;
   public String name;
   public double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public double calculateBonus()
    {
        return salary * 0.05;
    }

    public void displayInfo()
    {
        System.out.println("Emplee: " +name+ " | Salary: " +salary);
    }

    @Override
    public String toString() {
        return id + "-" +name+ "-" + "-" +salary;
    }
}
