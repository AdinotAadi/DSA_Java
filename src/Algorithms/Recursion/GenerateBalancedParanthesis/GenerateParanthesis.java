package Algorithms.Recursion.GenerateBalancedParanthesis;

import java.util.*;

public class GenerateParanthesis {
    private static void helper(List<String> ans, int n, int open, int closed, String s) {
        if (open == 0 && closed == 0) {
            ans.add(s);
            return;
        }
        if (open > 0) {
            helper(ans, n, open - 1, closed, s + "(");
        }
        if (closed > open) {
            helper(ans, n, open, closed - 1, s + ")");
        }
    }

    private static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, n, n, n, "");
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(generateParenthesis(n));
        sc.close();
    }
}
