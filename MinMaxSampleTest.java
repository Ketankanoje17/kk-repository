public class MinMaxSampleTest {


    public int maxValue(int[] max)
    {
        int maximum=max[0];
        for(int i=0;i<max.length;i++)
        {
            if(max[i] > maximum)
            {
                maximum=max[i];
            }
        }
        return maximum;
    }

    public int minvalue(int[] min)
    {
        int minimum=min[0];
        for(int i=0;i<min.length;i++)
        {
            if(min[i] < minimum)
            {
                minimum=min[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] maxMinArray ={11,44,3,55,544,334};
        MinMaxSampleTest m =new MinMaxSampleTest();
        System.out.println("maximum value is : "+m.maxValue(maxMinArray));
        System.out.println("minim value is : "+m.minvalue(maxMinArray));
    }
}
