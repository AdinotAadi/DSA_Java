package Algorithms.Recursion.NumberOfOnesGreaterThanZeroes;

import java.util.*;

public class GenerateBinaryStrings {
    private static void helper(ArrayList<String> ans, int ones, int zeroes, int n, int index, String s) {
        if(n == 0) {
            if(ones >= zeroes) {
                ans.add(s);
            }
            return;
        }
        helper(ans, ones + 1, zeroes, n - 1, index + 1, s + '1');
        if(ones > zeroes) {
            helper(ans, ones, zeroes + 1, n - 1, index + 1, s + '0');
        }
    }

    private static ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans = new ArrayList<>();
        helper(ans, 0, 0, N, 0, "");
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(NBitBinary(n));
        sc.close();
    }
}
