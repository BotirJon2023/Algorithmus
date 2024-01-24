package org.example;

    public class Main2 {

        int sum;

        // first constructor
        Main2() {
            // calling the second constructor
            this(5, 2);
        }

        // second constructor
        Main2(int arg1, int arg2) {
            // add two value
            this.sum = arg1 + arg2;
        }

        void display() {
            System.out.println("Sum is: " + sum);
        }

        // superclass
    class Languages {

        // constructor of the superclass
        Languages(int version1, int version2) {

            if (version1 > version2) {
                System.out.println("The latest version is: " + version1);
            }

            else {
                System.out.println("The latest version is: " + version2);
            }
        }
    }
}
