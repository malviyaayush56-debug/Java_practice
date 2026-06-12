package Strings;

public class count_vowel {
    static void main() {
        String str = "Ayush Malviya";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowel count = " + count);
    }
}
