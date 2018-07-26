package me.fanbin.leetcode.s0066;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 66. Plus One
 * @author fanbin
 * @date 2018/7/26
 */
public class PlusOneTest {

    private PlusOne plusOne;

    @Before
    public void before() {
        plusOne = new PlusOne();
    }

    @Test
    public void test() {
        int[] result1 = plusOne.plusOne(new int[]{1, 2, 3});
        Assert.assertEquals(1, result1[0]);
        Assert.assertEquals(2, result1[1]);
        Assert.assertEquals(4, result1[2]);
        int[] result2 = plusOne.plusOne(new int[]{4, 3, 2, 1});
        Assert.assertEquals(4, result2[0]);
        Assert.assertEquals(3, result2[1]);
        Assert.assertEquals(2, result2[2]);
        Assert.assertEquals(2, result2[3]);
        int[] result3 = plusOne.plusOne(new int[]{9, 9, 9});
        Assert.assertEquals(1, result3[0]);
        Assert.assertEquals(0, result3[1]);
        Assert.assertEquals(0, result3[2]);
        Assert.assertEquals(0, result3[3]);
    }

}
