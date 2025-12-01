package java2102025;

public class FibonaciTest {
    public static void main(String[] args) {
        int number=10;
        int res=Fibo(number);
        System.out.println(res);
    }
    public static int Fibo(int num1)
    {
        int result=0;
        int num=0;int num2=1;
        for(int i=2;i<num1;i++)
        {
             result= num+num2;
            System.out.println(result);
            num=num2;
            num2=result;
        }
        return num;
    }
}
