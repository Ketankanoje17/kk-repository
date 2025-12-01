package Inheritance.test;

public class FullStackDevloper extends Employee{
    public String programmingLanguage;

    public Double salaryFullStackDeveloper= 20000.0;

    public FullStackDevloper(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public FullStackDevloper(String name, String role, String designation, Double salary, String programmingLanguage) {
        super(name, role, designation, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public FullStackDevloper() {

    }

    @Override
    public Double getSalary() {
        return salaryFullStackDeveloper*20;
    }
}
