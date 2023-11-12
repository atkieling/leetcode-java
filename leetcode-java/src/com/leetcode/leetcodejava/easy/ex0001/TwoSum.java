package com.leetcode.leetcodejava.easy.ex0001;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;
        int[] output = twoSumSimpleSolution(nums, target);

        System.out.println("Os índices dos dois números são: [" + output[0] + ", " + output[1] + "]");

    }

    public static int[] twoSumSimpleSolution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }


}




