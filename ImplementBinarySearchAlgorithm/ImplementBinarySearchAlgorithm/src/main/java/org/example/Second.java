package org.example;

public class Second {

    int binarySearch(int array[], int element, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (array[mid] == element)
                return mid;

            if (array[mid] > element)
                return binarySearch(array, element, low, mid - 1);

            return binarySearch(array, element, mid + 1, high);
        }

        return -1;
    }

}
