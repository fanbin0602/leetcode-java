package me.fanbin.leetcode.s0035;

/**
 * 35. Search Insert Position
 * @author fanbin
 * @date 2018/7/23
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (target <= num) {
                return i;
            }
        }
        return nums.length;
    }

}
