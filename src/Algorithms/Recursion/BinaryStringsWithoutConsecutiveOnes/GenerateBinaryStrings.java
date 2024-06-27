package Algorithms.Recursion.BinaryStringsWithoutConsecutiveOnes;

import java.util.*;

public class GenerateBinaryStrings {
    private static void helper(ArrayList<String> ans, int n, int index, String s) {
        if(index == n) {
            ans.add(s);
            return;
        }
        if(index == 0 || s.charAt(index - 1) == '0') {
            helper(ans, n, index + 1, s + "0");
            helper(ans, n, index + 1, s + "1");
        } else {
            helper(ans, n, index + 1, s + "0");
        }
    }

    private static ArrayList<String> generateBinaryStrings(int n) {
        ArrayList<String> ans = new ArrayList<>();
        if(n == 0) { return ans; }
        helper(ans, n, 0, "");
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(generateBinaryStrings(n));
        sc.close();
    }
}
