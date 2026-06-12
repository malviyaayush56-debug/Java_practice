package Interview_Practice_Question;

import static java.util.Collections.reverse;
import static java.util.Collections.reverseOrder;

public class main{
    //Easy Method
    public static String main(String str) {
//        String str = "Ayush Malviya";

//     String reversed = new StringBuilder(str).reverse().toString();
//
//        System.out.println(reversed);

        //loop method

//    String reverse = "";
//    for (int i=str.length()-1;i>=0;i--){
//        reverse = reverse + str.charAt(i);
//    }
//        System.out.println(reverse);
//    }
        //Charactor Method
//    char[] arr = str.toCharArray();
//    for (int i=str.length()-1;i>=0;i--){
//        System.out.print(arr[i]);
//    }
        //Using Stack Method
//        Stack<Character> stack = new Stack<>();
//        for (char c : str.toCharArray()){
//            stack.push(c);
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop());
//        }
        //Recursive Method

        if (str.isEmpty()) {
            return str;
        }
        return main(str.substring(1)) + str.charAt(0);

    }

    static void main() {
        String str = "Ayush Malviya";
        System.out.println(main(str));
    }

}
