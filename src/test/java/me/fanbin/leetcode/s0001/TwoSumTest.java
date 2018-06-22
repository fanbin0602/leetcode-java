package me.fanbin.leetcode.s0001;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Two Sum Test
 * @author fanbin
 * @date 2018-06-22
 */
public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void before() {
        twoSum = new TwoSum();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        Assert.assertArrayEquals(twoSum.twoSum(new int[]{1, 8, 12, 19}, 9), new int[]{0, 1});
        Assert.assertArrayEquals(twoSum.twoSum(new int[]{5, 7, 11, 16}, 12), new int[]{0, 1});
        Assert.assertArrayEquals(twoSum.twoSum(new int[]{8, 9, 11, 15}, 17), new int[]{0, 1});
    }

}
