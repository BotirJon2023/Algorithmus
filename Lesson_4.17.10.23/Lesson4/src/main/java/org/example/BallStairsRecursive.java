package org.example;

public class BallStairsRecursive {

    public static void main(String[] args) {
        int N = 8; // Замените на желаемое количество ступенек
        int result = countRoutes(N);
        System.out.println("Number of routes: " + result);
    }

    public static int countRoutes(int n) {
        if (n <= 1) {
            return 1; // Базовый случай: 0 или 1 ступенька, только один маршрут
        } else {
            // Рекурсивно считаем количество маршрутов для предыдущих трех возможных ступенек
            return countRoutes(n - 1) + countRoutes(n - 2) + countRoutes(n - 3);
        }
    }
}

