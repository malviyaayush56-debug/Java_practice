package SOLID_RULES_BACKEND;
//Code ko extend kar sakte ho without old code modify kiye.
//Open Closed Principle (OCP)
//open for extension
//        but closed for modification

public class Open_Closed_Principle {
    interface Payment {
        void pay();
    }

    static class UPI implements Payment {

        public void pay() {
            System.out.println("UPI Payment");
        }
    }

    static class Card implements Payment {

        public void pay() {
            System.out.println("Card Payment");
        }
    }



        public static void main(String[] args) {

            Payment p1 = new UPI();
            p1.pay();

            Payment p2 = new Card();
            p2.pay();

    }


}
