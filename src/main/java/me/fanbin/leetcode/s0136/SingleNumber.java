package me.fanbin.leetcode.s0136;

import java.util.ArrayList;
import java.util.List;

/**
 * 136. Single Number
 * @author fanbin
 * @date 2018-06-22
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        List<Integer> list = new ArrayList<Integer>(nums.length/2);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int index = list.indexOf(num);
            if (index >= 0) {
                list.remove(index);
                continue;
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }

}
