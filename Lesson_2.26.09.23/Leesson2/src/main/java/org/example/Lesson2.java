package org.example;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(sum(3,5));

    }

    public static int sum (int a, int b) {
        int result = a + b;
        return result;

    }

    public static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array [i];

        }
        return result;
    }


}
