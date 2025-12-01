package java2102025;

public class largestElementArray {
    public static void main(String[] args) {
        int arr[]={12,22,33,23,111};
        int max=largestElementArrayData(arr);
        int min=smallestElementArrayData(arr);
        System.out.println("largest element is :"+max+"\n"+ "smallest element in array "+min);
    }
    public static int largestElementArrayData(int largest[])
    {
        int maximum=largest[0];

        for(int i=0;i<largest.length;i++)
        {
            if(largest[i] > maximum)
            {
                maximum=largest[i];
            }
        }
        return maximum;
    }

    //max
    public static int smallestElementArrayData(int largest[])
    {
        int minimum=largest[0];

        for(int i=0;i<largest.length;i++)
        {
            if(largest[i] < minimum)
            {
                minimum=largest[i];
            }
        }
        return minimum;
    }
}
