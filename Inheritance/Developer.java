package Inheritance;


public class Developer extends Employee {
    public String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void displayInfo() {
        System.out.println("Developer: " +name+ " | Language :" +programmingLanguage);
    }
}
