package java8;

public class LastWordsLength {
    public static void main(String[] args) {
        String s="ketan ashok kanoje ";
        String words=s.trim();
        int count=0;

        for(int i=words.length() -1 ;i>=0;i--)
        {
            if(words.charAt(i) != ' ')
            {
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);

    }
}
