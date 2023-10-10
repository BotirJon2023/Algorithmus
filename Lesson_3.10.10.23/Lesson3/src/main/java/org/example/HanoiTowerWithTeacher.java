package org.example;

public class HanoiTowerWithTeacher {

    public static void main(String[] args) {

        hanoi(3);

    }

    public static void hanoi(int n) {
        hanoiRecursive(n, 'A', 'B', 'C');
    }

    public static void hanoiRecursive(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("Move from " + start + " to " + end);
            return;
        }

        hanoiRecursive(n - 1, start, end, middle);
        System.out.println("Move from " + start + " to " + end);

        hanoiRecursive(n - 1, middle, start, end);
    }
}
