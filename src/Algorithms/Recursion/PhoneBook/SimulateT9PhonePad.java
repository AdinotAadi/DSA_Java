package Algorithms.Recursion.PhoneBook;

import java.util.*;

public class SimulateT9PhonePad {
    private static void helper(List<String> ans, String digits, StringBuilder curr, int index, HashMap<Character, String> map) {
        if(index == digits.length()) {
            ans.add(curr.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i = 0 ; i < letters.length(); ++i) {
            curr.append(letters.charAt(i));
            helper(ans, digits, curr, index + 1, map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    private static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.isEmpty()) { return ans; }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        helper(ans, digits, new StringBuilder(), 0, map);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();
        System.out.println(letterCombinations(digits));
        sc.close();
    }
}
