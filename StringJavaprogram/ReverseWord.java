package StringJavaprogram;

public class ReverseWord {
    public static void main(String[] args) {
        String input="ketan kanoje";
        System.out.println("original string: "+input);

        String output="";
        String[] words=input.split(" ");

        for(String words1:words)
        {
            String revWord="";
            for(int i=words1.length()-1;i>=0;i--)
            {
                revWord += words1.charAt(i);
            }
            output = output + revWord + " ";
            System.out.println(output);
        }
    }
}
