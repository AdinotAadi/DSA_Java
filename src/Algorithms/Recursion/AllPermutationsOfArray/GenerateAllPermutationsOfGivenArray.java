package Algorithms.Recursion.AllPermutationsOfArray;

import java.util.*;

public class GenerateAllPermutationsOfGivenArray {
    private static void helper(ArrayList<ArrayList<Integer>> ans, int[] nums, int index, ArrayList<Integer> s, HashSet<Integer> set) {
        if(index == nums.length) {
            ans.add(new ArrayList<>(s));
        }
        for(int i = 0 ; i < nums.length; ++i) {
            if(set.contains(nums[i])) { continue; }
            s.add(nums[i]);
            set.add(nums[i]);
            helper(ans, nums, index + 1, s, set);
            s.remove(s.size() - 1);
            set.remove(nums[i]);
        }
    }

    private static ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        helper(ans, nums, 0, new ArrayList<>(), set);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i <n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println(permute(arr));
        sc.close();
    }
}
