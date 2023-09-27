package org.example;

public class SumElements {

    public static void main(String[] args) {

        System.out.println(sumElements(10));
        System.out.println(sumInLoop(10));
    }

    private static int sumElements(int n) {
        if (n == 1) return 1;
        return n + sumElements(n - 1);
    }

    private static int sumInLoop(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
}
