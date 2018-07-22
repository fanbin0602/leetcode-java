package me.fanbin.leetcode.s0026;

/**
 * 26. Remove Duplicates from Sorted Array
 * @author fanbin
 * @date 2018/7/22
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int exist = 0;
        int result = 0;
        if (nums.length <= 1) {
            return nums.length;
        }
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                result++;
                exist = nums[i];
                continue;
            }
            if (nums[i] == exist) {
                continue;
            }
            nums[result] = nums[i];
            exist = nums[i];
            result++;
        }
        return result;
    }

}
