package java2102025;

import java.util.Arrays;

//first array string same as second array called as anagram
public class anagrams {
    public static void main(String[] args) {
        String s1="silent";
        String s2="slilent";
        System.out.println(anangram(s1,s2));
    }

    public static boolean anangram(String d1,String d2)
    {
        char[] arr1=d1.toCharArray();
        char[] arr2=d2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
