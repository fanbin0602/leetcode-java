package me.fanbin.leetcode.s0014;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 14. Longest Common Prefix
 * @author fanbin
 * @date 2018-07-17
 */
public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @Before
    public void before() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void test() {
        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{""}));
    }

}
