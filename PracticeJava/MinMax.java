package PracticeJava;

public class MinMax {

    public static int Max(int[] maxValue)
    {
       int maximum=maxValue[0];

        for(int i=0;i<maxValue.length;i++)
        {
            if(maxValue[i] >maximum)
            {
                maximum=maxValue[i];
            }
        }
        return maximum;
    }

    public static int Min(int[] minValue)
    {
        int minimum=minValue[0];

        for(int i=0;i<minValue.length;i++)
        {
            if(minValue[i] <minimum)
            {
                minimum=minValue[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        MinMax m=new MinMax();
        int[] number={5,11,66,434,22};
        System.out.println(m.Max(number));
        System.out.println(m.Min(number));
    }
}
