package LambdaExpression;

 interface Test1 {
    void fun1(int x);

}
class Main
{
    public static void main(String[] args) {
        Test1 fun = (int x) -> System.out.println(x*2);
  fun.fun1(10);
    }
}
