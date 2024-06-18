package Algorithms.Sorting.MergeSort;

import java.util.*;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) { return arr; }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0, j =0;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                ans[i + j] = left[i++];
            } else {
                ans[i + j] = right[j++];
            }
        }
        while(i < left.length) {
            ans[i + j] = left[i++];
        }
        while(j < right.length) {
            ans[i + j] = right[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 500, 3, 20, 55, 33, 11 };
        System.out.println("Array before sorting: " + Arrays.toString(arr) + ".");
        System.out.println("Array after sorting: " + Arrays.toString(mergeSort(arr)) + ".");
    }
}
