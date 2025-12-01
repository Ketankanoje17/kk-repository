package java2102025.test;

public class Fib1 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int result;
        int cutn=10;

        for(int i=2;i<cutn;i++)
        {
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }
}
