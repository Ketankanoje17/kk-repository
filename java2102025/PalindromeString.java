package java2102025;

public class PalindromeString {
    public static void main(String[] args) {
        String pali = "aewbba";

        boolean result = isPalindrome(pali);
        System.out.println(result);
    }

    public static boolean isPalindrome(String data) {
        StringBuilder sb = new StringBuilder();
        boolean isPalindrome = true;
        for (int i = data.length() - 1; i >= 0; i--) {
            sb.append(data.charAt(i));
        }

        if(data.equals(sb.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
