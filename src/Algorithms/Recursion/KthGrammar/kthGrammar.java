package Algorithms.Recursion.KthGrammar;

import java.util.*;

public class kthGrammar {
    public static int solve(int n, int k) {
        if(n == 1 && k == 1) { return 0; }
        int length = (int) Math.pow(2, n - 1);
        int mid = length / 2;
        if(k <= mid) { return solve(n - 1, k); }
        return (solve(n - 1, k - mid) == 1) ? 0 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(n, k));
        sc.close();
    }
}
