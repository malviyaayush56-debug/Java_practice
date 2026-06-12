package Interview_Practice_Question;

public class basic_practice {
//    static void main() {
//        int a =0;
//        int b = 1;
//        int n =10;
//        for (int i=1;i<n;i++){
//            System.out.print( a);
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//
//    }

    // palindrome number
    static void main() {
        int n = 121;
        int rev = 0;
        int temp = n;

        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not");


    }
}
