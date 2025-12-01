package comparablecompartor.comparator;

public class Student {
    private String name;
    private int rollNo;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(int age) {
        this.age = age;

    }
}
