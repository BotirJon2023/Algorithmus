package org.example;

public class HanoiTower {

    public static void main(String[] args) {
        int n = 3; // Количество дисков
        char sourcePeg = 'A'; // Исходная башня
        char auxiliaryPeg = 'B'; // Вспомогательная башня
        char destinationPeg = 'C'; // Целевая башня

        solveHanoi(n, sourcePeg, auxiliaryPeg, destinationPeg);
    }

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Переместить диск 1 с " + source + " на " + destination);
            return;
        }

        solveHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Переместить диск " + n + " с " + source + " на " + destination);
        solveHanoi(n - 1, auxiliary, source, destination);
    }
}
