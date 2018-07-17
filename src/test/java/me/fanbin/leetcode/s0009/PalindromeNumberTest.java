package me.fanbin.leetcode.s0009;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Palindrome Number
 * @author fanbin
 * @date 2018-07-17
 */
public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void before() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void test() {
        Assert.assertEquals(palindromeNumber.isPalindrome(121), true);
        Assert.assertEquals(palindromeNumber.isPalindrome(-121), false);
        Assert.assertEquals(palindromeNumber.isPalindrome(10), false);
    }

}
