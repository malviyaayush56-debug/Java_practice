package Strings;

import java.util.Scanner;

public class String_input {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("provide string contact: ");
//        String str = sc.nextLine();
//        System.out.println("Value of next line "+str);
//        System.out.println("provide string contact: ");
//        String str1 = sc.next();
//        System.out.println("value of next "+str1);

        String str = "Ayush";
      String str2 = "Malviya";
        System.out.println(str2.trim());

        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.equals(str2));
        System.out.println(str.toUpperCase());
        System.out.println(str.isBlank());

    }
}
