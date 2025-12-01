package java2102025;

public class largestSecondNumberArr {
    public static void main(String[] args) {
        int arr[]={10,2,44,33};
        int secondLargest=findsecondlargest(arr);
        System.out.println(secondLargest);
    }
    public static int findsecondlargest(int[] array)
    {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            int num=array[i];
            if(largest < num)
            {
                secondLargest=largest;
                largest=num;
            } else if (num >secondLargest && num !=largest) {
                secondLargest=num;

            }
        }
        return secondLargest;
    }
}
