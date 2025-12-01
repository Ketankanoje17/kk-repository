import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;

        if(num > 0)
        {
            int div=num%10;
            rev= rev * 10 + div;
            num=num/10;
        }
        System.out.println(rev);



    }
}
