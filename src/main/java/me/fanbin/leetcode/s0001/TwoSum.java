package me.fanbin.leetcode.s0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * @author fanbin
 * @date 2018-06-22
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.keySet().contains(target-num)) {
                return new int[]{map.get(target-num), i};
            }
            map.put(num, i);
        }
        return new int[2];
    }

}
