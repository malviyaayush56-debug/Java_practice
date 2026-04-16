package Strings;

public class String_comperition {
    static void main() {
        String str1 = "Ayush";
        String str2 = "ayush";

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Both string are equal");
        }
        else {
            System.out.println("Both strings are not equal");
        }
    }
}
