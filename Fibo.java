public class Fibo {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int number=10;
        int temp;
        for(int i=1;i<=number;i++)
        {
           int number1=n1+n2;
            System.out.print(n1 + " ");
            n1=n2;
            n2=number1;
        }
    }
}
