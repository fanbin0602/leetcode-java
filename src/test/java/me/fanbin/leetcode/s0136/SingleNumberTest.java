package me.fanbin.leetcode.s0136;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 136. Single Number Test
 * @author fanbin
 * @date 2018-06-22
 */
public class SingleNumberTest {

    private SingleNumber singleNumber;

    @Before
    public void before() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void test() {
        Assert.assertEquals(singleNumber.singleNumber(new int[]{2, 2, 1}), 1);
        Assert.assertEquals(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}), 4);
    }

}
