package java2102025;

public class additionOfArray {
    public static void main(String[] args) {
        int arr[]={2,5,66,2};
        int sum=sumofArray(arr);
        System.out.println(sum);
    }

    private  static int sumofArray(int sum[])
    {
        int addition=0;
        for(int i=0;i<sum.length;i++)
        {
            addition +=sum[i];
        }
        return addition;
    }
}
