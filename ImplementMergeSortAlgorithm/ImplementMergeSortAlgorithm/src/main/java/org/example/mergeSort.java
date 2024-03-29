package org.example;

import static java.io.ObjectInputFilter.merge;

public class mergeSort {


    void mergeSort(int array[], int left, int right) {
        if (left < right) {

            // m is the point where the array is divided into two sub arrays
            int mid = (left + right) / 2;

            // recursive call to each sub arrays
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted sub arrays
            merge(array, left, mid, right);
        }
        private void merge(int[] array, int left, int mid, int right) {

            int n1 = q - p + 1;
            int n2 = r - q;

            int L[] = new int[n1];
            int M[] = new int[n2];

            for (int i = 0; i < n1; i++)
                L[i] = array[p + i];
            for (int j = 0; j < n2; j++)
                M[j] = array[q + 1 + j];

            int i, j, k;
            i = 0;
            j = 0;
            k = p;

            while (i < n1 && j < n2) {
                if (L[i] <= M[j]) {
                    array[k] = L[i];
                    i++;
                } else {
                    array[k] = M[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                array[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                array[k] = M[j];
                j++;
                k++;
            }
        }
    }

    private void merge(int[] array, int left, int mid, int right) {



    }


}
