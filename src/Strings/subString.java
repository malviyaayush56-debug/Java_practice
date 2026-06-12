package Strings;

public class subString {
    static void main() {
//        String str = "my name is ayush malviya";
//        System.out.println(str.substring(3,6));
//        System.out.println(str.contains("ayush"));

//      int num = 51234;
//      String str = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str+1);
//
//        String name = "Ayush Malviya";
//        char[] crr = name.toCharArray();
//
//        for (char ch: crr){
//            System.out.println("value of char "+ch);
//        }

        String name = "my, name, is ,Ayush ,malviya";
        String[] words = name.split(",");
        for (String str:words){
            System.out.print(str);
        }


    }
}
