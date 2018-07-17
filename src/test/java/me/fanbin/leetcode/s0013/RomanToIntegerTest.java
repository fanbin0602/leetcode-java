package me.fanbin.leetcode.s0013;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 13. Roman to Integer
 * @author fanbin
 * @date 2018-07-17
 */
public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @Before
    public void before() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void test() {
        Assert.assertEquals(3, romanToInteger.romanToInt("III"));
        Assert.assertEquals(4, romanToInteger.romanToInt("IV"));
        Assert.assertEquals(9, romanToInteger.romanToInt("IX"));
        Assert.assertEquals(58, romanToInteger.romanToInt("LVIII"));
        Assert.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

}
