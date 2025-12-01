package Polymorphism.MethodOverloading;

public class Customer {
 public   void searchCustomer(int id)
    {
        System.out.println("Customer id is :"+id);
    }

    void searchCustomer(String name)
    {
        System.out.println("Customer name is :"+name);
    }

    void searchCustomer(String name,int id)
    {
        System.out.println("Customer name is :"+name+ "and id is :"+id);
    }
}
