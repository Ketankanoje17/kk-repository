package java2102025.test;

public class sumOfDigit {
    public static void main(String[] args) {
        int num=399;
        int add=0;

        while (num != 0)
        {
            int res=num %10;

            add=add+res;
            num=num/10;

        }
        System.out.println(add);
    }
}
