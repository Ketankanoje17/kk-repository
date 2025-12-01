package java2102025.impor;
interface myFunction{
    void sayHello();
}

public class LambdaExpressionFuncInterface {
    public static void main(String[] args) {
        myFunction  m= () ->
        {
            System.out.println("Hello world");
        };
        m.sayHello();
    }
}
