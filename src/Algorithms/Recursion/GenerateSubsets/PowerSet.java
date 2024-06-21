package Algorithms.Recursion.GenerateSubsets;

import java.util.*;

public class PowerSet {
    static List<List<Integer>> ansSets = new ArrayList<>();

    private static void generateSubsets(List<Integer> subset, int i, int[] nums) {
        if(i == nums.length) {
            ansSets.add(new ArrayList<>(subset));
            return;
        }
        if(i < nums.length) {
            // To not take i-th element:
            generateSubsets(subset, i + 1, nums);
            // To take i-th element:
            subset.add(nums[i]);
            generateSubsets(subset, i + 1, nums);
            subset.remove(subset.size() - 1);
        }
    }

    private static List<List<Integer>> subsets(int[] nums) {
        generateSubsets(new ArrayList<>(), 0, nums);
        return ansSets;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) { nums[i] = sc.nextInt(); }
        System.out.println(subsets(nums));
        sc.close();
    }
}
