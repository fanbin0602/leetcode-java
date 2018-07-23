package me.fanbin.leetcode.s0027;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 27. Remove Element
 * @author fanbin
 * @date 2018/7/23
 */
public class RemoveElementTest {

    private RemoveElement removeElement;

    @Before
    public void before() {
        removeElement = new RemoveElement();
    }

    @Test
    public void test() {
        Assert.assertEquals(2, removeElement.removeElement(new int[]{3,2,2,3}, 3));
        Assert.assertEquals(5, removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

}
