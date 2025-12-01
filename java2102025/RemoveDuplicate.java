package java2102025;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String data = "asdfdsaaa";

        HashSet<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : data.toCharArray()) {
            if (!hs.contains(ch)) {
                hs.add(ch);
                sb.append(ch);
            }
        }
        System.out.println(" duplicate :"+data);
        System.out.println("After removing duplicate :"+sb);
    }
}
