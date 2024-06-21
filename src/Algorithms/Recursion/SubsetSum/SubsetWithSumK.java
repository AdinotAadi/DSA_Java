package Algorithms.Recursion.SubsetSum;

import java.util.*;

public class SubsetWithSumK {
    private static List<List<Integer>> ansList = new ArrayList<>();

    private static void helper(ArrayList<Integer> s, int n, int k, int i, int currSum, int[] a) {
        if(i == n) {
            if(currSum == k) {
                ansList.add(new ArrayList<>(s));
            }
            return;
        }
        // Take i-th element:
        s.add(a[i]);
        helper(s, n, k, i + 1, currSum + a[i], a);
        s.remove(s.size() - 1);
        // Don't take i-th element:
        helper(s, n, k, i + 1, currSum, a);
    }
    private static List<List<Integer>> perfectSum(int[] a, int n, int k) {
        helper(new ArrayList<>(), n, k, 0, 0, a);
        return ansList;
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
        List<List<Integer>> ans = perfectSum(arr, n, k);
        System.out.println(ans);;
        sc.close();
    }
}
