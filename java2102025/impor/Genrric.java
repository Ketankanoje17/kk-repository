package java2102025.impor;

public class Genrric<T> {
    public boolean areEqual(T val1,T val2)
    {
        return val1==val2;
    }

    public boolean notEqual(T val1,T val2)
    {
        return val1==val2;
    }

    public static void main(String[] args) {
        Genrric<Integer> a=new Genrric<>();
        boolean result= a.areEqual(11,11);
        System.out.println(result);
    }
}
