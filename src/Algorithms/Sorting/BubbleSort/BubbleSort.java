package Algorithms.Sorting.BubbleSort;

import java.util.*;

public class BubbleSort {
    public static void bubbleSortIterative(int[] arr) {
        int n = arr.length - 1;
        for(int i = 0; i < n -  1; i++) {
            for(int j = 0; j < n - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    System.out.println("Array after swapping: " + Arrays.toString(arr) + ".");
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j] + ".");
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 500, 3, 20, 55, 33, 11 };
        System.out.println("Array before sorting: " + Arrays.toString(arr) + ".");
        bubbleSortIterative(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr) + ".");
    }

}

/*
* Output:
    * Array before sorting: [1, 500, 3, 20, 55, 33, 11].
    * Swapping 500 and 3.
    * Array after swapping: [1, 3, 500, 20, 55, 33, 11].
    * Swapping 500 and 20.
    * Array after swapping: [1, 3, 20, 500, 55, 33, 11].
    * Swapping 500 and 55.
    * Array after swapping: [1, 3, 20, 55, 500, 33, 11].
    * Swapping 500 and 33.
    * Array after swapping: [1, 3, 20, 55, 33, 500, 11].
    * Swapping 500 and 11.
    * Array after swapping: [1, 3, 20, 55, 33, 11, 500].
    * Swapping 55 and 33.
    * Array after swapping: [1, 3, 20, 33, 55, 11, 500].
    * Swapping 55 and 11.
    * Array after swapping: [1, 3, 20, 33, 11, 55, 500].
    * Swapping 33 and 11.
    * Array after swapping: [1, 3, 20, 11, 33, 55, 500].
    * Swapping 20 and 11.
    * Array after swapping: [1, 3, 11, 20, 33, 55, 500].
    * Array after sorting: [1, 3, 11, 20, 33, 55, 500].

 */