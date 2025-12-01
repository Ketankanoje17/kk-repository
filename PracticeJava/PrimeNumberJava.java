package PracticeJava;

public class PrimeNumberJava {
    public static void main(String[] args) {
        int primeNumers=50;
        int count=0;

        for(int i=2;i<=primeNumers;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\ncount of total prime numbers "+primeNumers+ "and count is"+count);
    }
}
