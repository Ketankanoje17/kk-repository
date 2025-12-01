package GenericClass;

public class Student<T> {
    public T data;

    Student(T data)
    {
        this.data=data;
    }
    public void display()
    {
        System.out.println("data is "+data);
    }

    public static void main(String[] args) {
        Student s=new Student(1);
        Student s1=new Student("ketan");

        s.display();
        s1.display();
        System.out.println(s);
        System.out.println(s1);
    }
}
