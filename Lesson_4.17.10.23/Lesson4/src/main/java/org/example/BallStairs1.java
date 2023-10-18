package org.example;

public class BallStairs1 {

    public static int countWays(int n) {
        if (n <= 2) {
            return n;
        }
        int[] ways = new int[n + 1];
        ways[0] = 0;
        ways[1] = 1;
        ways[2] = 2;
        ways[3] = 4;

        for (int i = 4; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3];
        }
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 8; // Замените на нужное количество ступенек
        int ways = countWays(n);
        System.out.println("Число всевозможных маршрутов: " + ways);
    }
}

