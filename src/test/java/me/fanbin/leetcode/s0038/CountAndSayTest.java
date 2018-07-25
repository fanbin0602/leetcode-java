package me.fanbin.leetcode.s0038;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 38. Count and Say
 * @author fanbin
 * @date 2018/7/25
 */
public class CountAndSayTest {

    private CountAndSay countAndSay;

    @Before
    public void before() {
        countAndSay = new CountAndSay();
    }

    @Test
    public void test() {
        Assert.assertEquals("1", countAndSay.countAndSay(1));
        Assert.assertEquals("11", countAndSay.countAndSay(2));
        Assert.assertEquals("21", countAndSay.countAndSay(3));
        Assert.assertEquals("1211", countAndSay.countAndSay(4));
        Assert.assertEquals("111221", countAndSay.countAndSay(5));
    }

}
