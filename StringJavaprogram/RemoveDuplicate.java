package StringJavaprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s1="Programming";
        //1
        StringBuilder sb1=new StringBuilder();
        s1.chars().distinct().forEach(c ->sb1.append((char)c));
        System.out.println(sb1);

        //2
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            int idx=s1.indexOf(ch,i+1);
            if(idx==-1){
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

        //3
        char[] arr=s1.toCharArray();
        StringBuilder sb3=new StringBuilder();
        for (int i=0;i<arr.length;i++)
        {
            boolean repeated=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    repeated=true;
                    break;
                }
            }
            if(!repeated)
            {
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);

        //4
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++)
        {
            set.add(s1.charAt(i));
        }
        for(char c:s1.toCharArray())
        {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
