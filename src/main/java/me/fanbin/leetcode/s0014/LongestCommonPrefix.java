package me.fanbin.leetcode.s0014;

/**
 * 14. Longest Common Prefix
 * @author fanbin
 * @date 2018-07-17
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return "";
        }
        for (int i = 1; ; i++) {
            String prefix = null;
            try {
                prefix = strs[0].substring(0, i);
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
            boolean isMatch = true;
            for (String str : strs) {
                if (str.startsWith(prefix)) {
                    continue;
                }
                isMatch = false;
                break;
            }
            if (isMatch) {
                result = prefix;
                continue;
            }
            break;
        }
        return result;
    }

}
