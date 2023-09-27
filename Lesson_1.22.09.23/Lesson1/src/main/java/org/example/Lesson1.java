package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lesson1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 5, 4, 5, -10, 0, 8, 99};
        sortBruteForce(numbers);
        System.out.println(Arrays.toString(numbers));


        numbers = new int[]{1, 5, 4, 5, -10, 0, 8, 99};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void sortBruteForce(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }

            }

        }
    }


    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int indMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indMin = j;
                    min = numbers[j];
                }

            }

        }
    }


    private static int[] generateTestData(int n) {
        Random random = new Random();
        int[] testData = new int[n];
        for (int i = 0; i < n; i++) {
            testData[i] = random.nextInt();
        }
        return testData;

        public static void mySort(int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                int min = numbers[i];
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] < min) {
                        min = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = min;
                    }
                }
            }
        }
    }
}
