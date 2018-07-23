package me.fanbin.leetcode.s0027;

/**
 * 27. Remove Element
 * @author fanbin
 * @date 2018/7/23
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int removeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == val) {
                removeCount++;
            } else {
                nums[i-removeCount] = num;
            }
        }
        return nums.length - removeCount;
    }

}
