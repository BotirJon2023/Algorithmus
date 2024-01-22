package org.example;

import java.util.Scanner;

public class ImplementBubbleSortAlgorithm {

    Scanner input = new Scanner(System.in);

    void bubbleSort(int array[]) {
        int size = array.length;

        System.out.println("Choose Sorting Order:");
        System.out.println("1 for Ascending \n2 for Descending");
        int sortOrder = input.nextInt();

        for (int i = 0; i < size - 1; i++)

            for (int j = 0; j < size - i - 1; j++)

                if (sortOrder == 1) {
                    if (array[j] > array[j + 1]) {

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
    }

}