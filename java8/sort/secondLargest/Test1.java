package java8.sort.secondLargest;

public class Test1 {
    public static void main(String[] args) {
        int numbers[] = {11, 33, 44, 32, 322};
        int second = secondLargest(numbers);
        System.out.println(second);

    }

    public static int secondLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++)
        {
            int numLength=num[i];
           if(largest < numLength)
           {
               secondLargest=largest;
               largest=numLength;
           }else if(largest > numLength){
               secondLargest=numLength;

           }
        }

        return secondLargest;
    }
}