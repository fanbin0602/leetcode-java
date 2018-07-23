package me.fanbin.leetcode.s0035;

import me.fanbin.leetcode.s0035.SearchInsertPosition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 35. Search Insert Position
 * @author fanbin
 * @date 2018/7/23
 */
public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @Before
    public void before() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void test() {
        Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
        Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
        Assert.assertEquals(4, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7));
        Assert.assertEquals(0, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 0));
    }

}
