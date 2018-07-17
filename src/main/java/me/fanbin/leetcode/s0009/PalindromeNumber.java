package me.fanbin.leetcode.s0009;

/**
 * Palindrome Number
 * @author fanbin
 * @date 2018-07-17
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String source = String.valueOf(x);
        String target = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            target += source.charAt(i);
        }
        return source.equals(target);
    }

}
