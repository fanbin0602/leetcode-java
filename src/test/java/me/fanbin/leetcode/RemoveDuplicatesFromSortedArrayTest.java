package me.fanbin.leetcode;

import me.fanbin.leetcode.s0026.RemoveDuplicatesFromSortedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 26. Remove Duplicates from Sorted Array
 * @author fanbin
 * @date 2018/7/22
 */
public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Before
    public void before() {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(0, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{}));
        Assert.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1,1,2}));
        Assert.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

}
