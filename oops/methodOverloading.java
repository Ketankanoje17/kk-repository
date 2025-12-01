package oops;

public class methodOverloading {
    String name;

    void greeting()
    {
        System.out.println("Hello World\n");
    }
    String greeting(String a)
    {
        return "good morning :"+a;
    }
    void greeting(String name,String rollNo)
    {
        System.out.println("Hello World, My name is : "+name+ "and roll no is"+rollNo+"\n");

    }
}
class Main{
    public static void main(String[] args) {
        methodOverloading m=new methodOverloading();
        m.greeting("ketan");
        m.greeting("ketan","11");
        m.greeting();
    }
}


