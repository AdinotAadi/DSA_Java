package Algorithms.Searching.BinarySearch;

import java.util.*;

public class BinarySearch {
    private static int binarySearch(int[] arr, int k, int low, int high) {
        if(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == k) { return mid; }
            else if(arr[mid] > k) { return binarySearch(arr, k, low, mid - 1); }
            return binarySearch(arr, k, mid + 1, high);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, k, 0, n - 1));
        sc.close();
    }
}
