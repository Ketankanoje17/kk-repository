package java2102025;

public class FactorialPractice {
    public static void main(String[] args) {
        int num=5;
        int fact=factorialNumber(num);
        System.out.println(fact);
    }
    public static int factorialNumber(int num1)
    {
        int fact=1;
        for(int i=1;i<=num1;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
