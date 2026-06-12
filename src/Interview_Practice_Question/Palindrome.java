package Interview_Practice_Question;
//reverse method
public class Palindrome {
//    static void main() {
//        String str = "nitio";
//        String rev = "";
//   for (int i= str.length()-1;i>=0;i--){
//       rev = rev + str.charAt(i);
//   }
//   if (str.equals(rev)){
//       System.out.println("Palindrome "+ rev);
//   }
//    else {
//       System.out.println("Not Palindrome");
//   }
    //Short Method (StringBuilder)
//    String str = "madam";
//    String palin = new StringBuilder(str).reverse().toString();
//    if (str.equals(palin)){
//        System.out.println("Palindrome : "+palin);
//    }else {
//        System.out.println("Not Palindrome");
//    }
//Best Interview Method (Without Reverse)
//
// String str = "naman" ;
// boolean ispalindrome = true;
//
// for (int i=0;i<str.length()/2;i++){
//     if (str.charAt(i) != str.charAt(str.length()-1-i)){
//         ispalindrome = false;
//         break;
//     }
//    }
//if (ispalindrome){
//    System.out.println("Palindrome "+str);
//}else {
//    System.out.println("Not palindrome ");
//}
//}
        //Using Recursion (Advanced)

   static boolean palindrome(String str , int start , int end){
       if (start>=end){
           return true;
       }
       if (str.charAt(start) != str.charAt(end)){
           return false;
       }
       return palindrome(str, start-1, end-1);

   }


    public static void main(String[] args) {

        String str = "madam";

        System.out.println(palindrome(str, 0, str.length()-1));
    }


}
