package java2102025;

public class secondLargestPractice {
    public static void main(String[] args) {
        int[] array={11,4,22,121,112};
        int secondLargest=secondLargestPracticeNum(array);
        System.out.println(secondLargest);
    }
    public static int secondLargestPracticeNum(int[] arr)
    {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr)
        {
            if(largest < num)
            {
                secondLargest=largest;
                largest= num;
            } else if (num > secondLargest) {
                secondLargest= num;
            }
        }
        return secondLargest;
    }
}
