package Loops;

import java.util.Scanner;

public class Dowhile {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int n = sc.nextInt();

//        int i = 1;
//        while(i<=8){
//            System.out.println(i+" ");
//            i++;

//        int i = 1;
//        do{
//            System.out.println(i+" ");
//            i++;
//        } while (i<=10);

//        int x = 1;
//        while(x==1)
//
//            x = x-1;
//
//        System.out.println(x);

 // this code show error output
//int i ;
//while(i= 10){
//    System.out.println(i);
//    i = i + 1;
//}

//while ('a'<'b')
//
//    System.out.println("malayalam is palindrome");
//this code give infine loop
//

       int x = 4 , y = 0;
       while (x >= 0){
           x--;
           y++;
           if(x==y)
               continue;
           else
               System.out.println(x+""+y);
       }

    }
}
