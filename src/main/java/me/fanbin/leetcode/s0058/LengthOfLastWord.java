package me.fanbin.leetcode.s0058;

/**
 * 58. Length of Last Word
 * @author fanbin
 * @date 2018/7/25
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] array = s.split(" ");
        if (array.length == 0) {
            return 0;
        }
        return array[array.length-1].length();
    }

}
