package java8.allinone.important;

public class ArrayMax {
    public static void main(String[] args) {
        int arr[] ={33,56,54,343,12,33};
        
        int maximum=arr[0];
        int minimum=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > maximum)
            {
                maximum=arr[i];
            }
            if(arr[i]  < minimum)
            {
                minimum=arr[i];
            }
        }
        System.out.println("maximum = " + maximum);
        System.out.println("miimum = " + minimum);

    }
}
