package Algorithms.Recursion.SubsetSum;

import java.util.*;

public class CheckExistanceOfSubsetWithSumK {
    private static boolean helper(int[] arr, int n, int k, int i, int currSum) {
        if(i == n) {
            return currSum == k;
        }
        // Take:
        if(helper(arr, n, k, i + 1, currSum + arr[i])) { return true; }
        // Not take:
        if(helper(arr, n, k, i + 1, currSum)) { return true; }
        return false;
    }

    private static boolean checkSubsetSum(int[] arr, int n, int k) {
        return helper(arr, n, k, 0, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        k = sc.nextInt();
        boolean check = checkSubsetSum(arr, n, k);
        System.out.println(check);
        sc.close();
    }
}
