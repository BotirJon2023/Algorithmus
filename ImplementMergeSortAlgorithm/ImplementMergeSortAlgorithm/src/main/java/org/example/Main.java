package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {6, 5, 12, 10, 9, 1};

        Main ob = new Main();

        ob.mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }
}
