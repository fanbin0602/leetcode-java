package me.fanbin.leetcode.s0053;

/**
 * 53. Maximum Subarray
 * @author fanbin
 * @date 2018/7/25
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int result = 0;
        boolean isDefault = true;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > result || isDefault) {
                    result = sum;
                    isDefault = false;
                }
            }
        }
        return result;
    }

}
