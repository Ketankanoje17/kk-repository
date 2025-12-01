package PracticeJava;

public class PracticeaJava {
    public static void main(String[] args) {
        String inputData="aaabaababaaa";
        String target="aa";
        int count=0;

        for(int i=0;i<inputData.length() - target.length();i++)
        {
            if(inputData.substring(i,i+target.length()).equals(target))
            {
             count++;
            }
        }
        System.out.println("count the number of string :"+count);
    }
}
