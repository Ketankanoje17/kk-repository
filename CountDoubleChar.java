public class CountDoubleChar {
    public static void main(String[] args) {
        String input="aabbbaabaaa";
        String target="aa";
        int count=0;

        for(int i=0;i<=input.length() - target.length();i++)
        {
            if(input.substring(i, i +  target.length()).equals(target))
            {
                count++;
            }
        }
        System.out.println("Input "+input);
        System.out.println(target+": Occurance is : " +count);
    }
}
