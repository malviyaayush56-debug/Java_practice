package Loops;

import java.util.Scanner;

public class Table_print {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a table number: ");
      int n = sc.nextInt();

     for(int i = 1;i<=10;i++){
         System.out.println(n+" X "+i+" = " +(n * i));
     }

    }

    public static class multiple_variable {
        static void main() {
            int x = 5 , y = 8 , z = 10;

            System.out.println("Hello "+x+y+z);


            System.out.println(x+y+""+z);
            System.out.println(x+y+z + " Mast lag raha");
        }
    }
}
