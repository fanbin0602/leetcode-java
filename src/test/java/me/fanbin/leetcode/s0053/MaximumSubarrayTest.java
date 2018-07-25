package me.fanbin.leetcode.s0053;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author fanbin
 * @date 2018/7/25
 */
public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @Before
    public void before() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void test() {
        Assert.assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
