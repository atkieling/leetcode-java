package com.leetcode.leetcodejava.easy.ex0001;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;
        int[] output = twoSumHashMapSolution(nums, target);

        System.out.println("Os índices dos dois números são: [" + output[0] + ", " + output[1] + "]");
    }

    public static int[] twoSumBruteForceSolution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] twoSumHashMapSolution(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}




