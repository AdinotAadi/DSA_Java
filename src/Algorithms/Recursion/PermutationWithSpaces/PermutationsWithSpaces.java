package Algorithms.Recursion.PermutationWithSpaces;

import java.util.*;

public class PermutationsWithSpaces {
    private static void helper(ArrayList<String> ans, String s, String curr, int index) {
        if(index == s.length()) {
            ans.add(curr);
            return;
        }
        // Include a space:
        if(index > 0) {
            helper(ans, s, curr + " " + s.charAt(index), index + 1);
        }
        // Not to include a space:
        helper(ans, s, curr + s.charAt(index), index + 1);
    }

    private static ArrayList<String> generatePermutationWithSpaces(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if(s == null || s.isEmpty()) { return ans; }
        helper(ans, s, "", 0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        System.out.println("All permutations with spaces for the string " + s + " are:");
        ArrayList<String> ans = generatePermutationWithSpaces(s);
        System.out.println(ans);
        sc.close();
    }
}
