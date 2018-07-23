package me.fanbin.leetcode.s0028;

/**
 * 28. Implement strStr()
 * @author fanbin
 * @date 2018/7/23
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (haystack == null
                || needle == null
                || needle.length() == 0) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

}
