package Strings;

public class print_all_charactor {

    public static void main(String[] args) {

//        String str = "Ayush";
//        int n = str.length();
//
//        // print each character
//        for (int i = 0; i < n; i++) {
//            char ch = str.charAt(i);
//            System.out.println(ch);
//        }
//
//        // custom length function test
//        System.out.println("Custom length: " + getlength(str));
//    }
//
//    static int getlength(String str) {
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            count++;
//        }
//
//        return count;


                String str = "Ayush";

                char[] arr = str.toCharArray();

                int count = 0;
                for (char ch : arr) {
                    count++;
                }

                System.out.println("Length = " + count);
            }
        }
