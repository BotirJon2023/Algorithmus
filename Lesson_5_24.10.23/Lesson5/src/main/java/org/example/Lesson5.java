package org.example;

import java.util.Arrays;

public class Lesson5 {

    private int[] data;

    private int size;

    private int count;

    public void CustomDynamicArray() {

        data = new int[1];

        size = 1;

        count = 0;


    }

    public void CustomDynamicArray(int capacity) {
        data = new int[capacity];
        size = capacity;
        count = 0;


    }

    public void add(int element) {
        if (count >= size) {
            growSize();
        }
        data[count++] = element;


    }

    private void growSize() {
        int[] newData = new int[2 * size];
        for (int i = 0; i < count; i++) {
            newData[i] = data[i];

        }
        data = newData;
    }

    public static void main(String[] args) {
        CustomDynamicArray array = new CustomDynamicArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < count; i++) {
            result = result + data[i] + " , ";

        }
        result = result + "]";
        return result;

    }

    public void printInnerStructure() {
        System.out.println(Arrays.toString(data));
    }

}
