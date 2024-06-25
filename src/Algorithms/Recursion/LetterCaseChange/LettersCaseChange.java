package Algorithms.Recursion.LetterCaseChange;

import java.util.*;

public class LettersCaseChange {
    private static void helper(ArrayList<String> ans, String s, String curr, int index) {
        if(index == s.length()) {
            ans.add(curr);
            return;
        }
        if(Character.isAlphabetic(s.charAt(index))) {
            String s1 = ("" + s.charAt(index)).toLowerCase();
            String s2 = ("" + s.charAt(index)).toUpperCase();
            helper(ans, s, curr + s1, index + 1);
            helper(ans, s, curr + s2, index + 1);
        } else {
            String s1 = ("" + s.charAt(index));
            helper(ans, s, curr + s1, index + 1);
        }
    }

    private static ArrayList<String> letterCaseChange(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if(s == null || s.isEmpty()) { return ans; }
        helper(ans, s, "", 0);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();
        System.out.println("All permutations with change of case for the string " + s + " are:");
        ArrayList<String> ans = letterCaseChange(s);
        System.out.println(ans);
        sc.close();
    }
}
