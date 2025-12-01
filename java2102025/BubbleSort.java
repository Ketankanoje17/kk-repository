package java2102025;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] listarr={23,11,26,9,76,3};
         sortedArray(listarr);
        System.out.println(Arrays.toString(listarr));
    }

    private static void sortedArray(int[] listarr) {
        for(int i=0;i<listarr.length-1;i++)
        {
            for(int j=0;j<listarr.length-1-i;j++)
            {
                if(listarr[j] > listarr[j+1])
                {
                    int temp=listarr[j];
                    listarr[j]=listarr[j+1];
                    listarr[j+1]=temp;
                }
            }
        }
    }
}
