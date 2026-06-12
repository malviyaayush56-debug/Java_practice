package SOLID_RULES_BACKEND;
//High level class directly low level class pe depend na kare.


public class Dependency_inversion {


        interface Keyboard {

        }

        // Wired Keyboard
        static class WiredKeyboard implements Keyboard {

        }

        // Wireless Keyboard
        static class WirelessKeyboard implements Keyboard {

        }

        // High level class
        static class Computer {

            Keyboard keyboard;

            Computer(Keyboard keyboard) {
                this.keyboard = keyboard;
            }

            void start() {
                System.out.println("Computer started");
            }
        }

        public static void main(String[] args) {

            // Wired keyboard use
            Keyboard wired = new WiredKeyboard();
            Computer c1 = new Computer(wired);
            c1.start();

            // Wireless keyboard use
            Keyboard wireless = new WirelessKeyboard();
            Computer c2 = new Computer(wireless);
            c2.start();
        }
    
}
