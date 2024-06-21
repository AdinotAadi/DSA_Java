package Algorithms.Recursion.SubsetSum;

import java.util.*;

public class CountSubsetsWithSumK {
    private static int helper(int[] arr, int n, int k, int currSum, int i) {
        if(i == n) {
            if(currSum == k) {
                return 1;
            } return 0;
        }
        // Don't take i-th element:
        int l = helper(arr, n, k, currSum, i + 1);
        // Take i-th element:
        int r = helper(arr, n, k, currSum + arr[i], i + 1);
        return (int) ((int) (l + r) % (1e9 + 7));
    }

    private static int countPerfectSum(int[] arr, int n, int k) {
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
        int count = countPerfectSum(arr, n, k);
        System.out.println(count);;
        sc.close();
    }
}
