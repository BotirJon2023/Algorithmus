package org.example;

import java.util.Arrays;

public class Main {
    private int[] data;

    public static void main(String[] args) {

        int[] data = {-2, 45, 0, 11, -9};

        Main bs = new Main();

        bs.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");

        System.out.println(Arrays.toString(data));
    }

    public void bubbleSort(int[] data) {
        this.data = data;
    }
}