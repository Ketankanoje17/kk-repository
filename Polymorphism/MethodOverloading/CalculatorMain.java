package Polymorphism.MethodOverloading;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(11,11);
        c.add(22,33,44);
        c.add(11.44,22.22);
        System.out.println(c.add(11,11));
        System.out.println(c.add(22,33,44));
        System.out.println( c.add(11.44,22.22));


    }
}
