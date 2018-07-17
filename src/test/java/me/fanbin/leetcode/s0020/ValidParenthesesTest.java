package me.fanbin.leetcode.s0020;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 20. Valid Parentheses
 * @author fanbin
 * @date 2018-07-17
 */
public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void before() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void test() {
        Assert.assertEquals(true, validParentheses.isValid("()"));
        Assert.assertEquals(true, validParentheses.isValid("()[]{}"));
        Assert.assertEquals(false, validParentheses.isValid("(]"));
        Assert.assertEquals(false, validParentheses.isValid("([)]"));
        Assert.assertEquals(true, validParentheses.isValid("{[]}"));
    }

}
