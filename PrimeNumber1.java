public class PrimeNumber1 {
    public static void main(String[] args) {
        int number=50;
        int count=0;

        for(int i=2;i<=number;i++)
        {
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(i+" ");
                count++;
            }
        }
        System.out.println("Total no of count is {" +number+ "} this and prime numbser are "+count);
    }
}
