package Inheritance;

public class Manager extends Employee{
    public int size;

    public Manager(int id, String name, double salary, int size) {
        super(id, name, salary);
        this.size = size;
    }

    @Override
    public double calculateBonus() {
        return 10*5;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " +name+ " | Size :" +size);
    }
}
