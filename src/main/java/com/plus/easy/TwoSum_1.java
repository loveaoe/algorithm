package com.plus.easy;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum_1 {

    public static void main(String[] args) {
        TwoSum_1 twoSum1 = new TwoSum_1();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] x = twoSum1.twoSum(nums, target);
        for (int i : x) {
            System.out.println(i);
        }
    }

    /**
     * 依次将i与i后面的每一个数相加比较是否为目标值
     */
    public int[] twoSum(int[] nums, int target) {
        int i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
