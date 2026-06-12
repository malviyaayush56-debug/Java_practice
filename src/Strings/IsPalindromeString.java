package Strings;

public class IsPalindromeString {
    static void main() {
        String str = "madam";

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
