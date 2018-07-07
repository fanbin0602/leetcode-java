package me.fanbin.leetcode.s0007;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Reverse Integer
 * @author fanbin
 * @date 2018-07-06
 */
public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void before() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void test() {
        Assert.assertEquals(reverseInteger.reverse(123), 321);
        Assert.assertEquals(reverseInteger.reverse(-123), -321);
        Assert.assertEquals(reverseInteger.reverse(120), 21);
    }

}
