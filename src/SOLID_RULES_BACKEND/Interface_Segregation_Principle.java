package SOLID_RULES_BACKEND;
//Badi interface mat banao.
//Small small interfaces banao.
//Interface Segregation Principle (ISP)

public class Interface_Segregation_Principle {


        interface Workable {
            void work();
        }

        interface Eatable {
            void eat();
        }

        // Employee class
        static class Employee implements Workable, Eatable {

            public void work() {
                System.out.println("Employee is working");
            }

            public void eat() {
                System.out.println("Employee is eating");
            }
        }

        public static void main(String[] args) {

            Employee emp = new Employee();

            emp.work();
            emp.eat();

    }
}
