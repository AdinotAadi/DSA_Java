package Algorithms.Searching.LinearSearch;

import java.util.*;

public class LinearSearch {
    private static int linearSearch(int[] arr, int k) {
        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] == k) { return i; }
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
        System.out.println(linearSearch(arr, k));
        sc.close();
    }
}
