package Polymorphism.MethodOverloading;

public class Employee {
    int id;
    String name;
    String designation;

    public void show(int id, String name) {
        System.out.println("id is "+id+ "name is "+name);
   }

    public void show(String designation) {
        System.out.println("designation :"+designation);
    }

    void display()
    {
        System.out.println("college id is :"+id+ "name is : "+(name != null ? name :null)+ "department is "+(designation != null ? designation : null));
    }
}
