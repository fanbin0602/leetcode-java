package me.fanbin.leetcode.s0007;

/**
 * Reverse Integer
 * @author fanbin
 * @date 2018-07-06
 */
public class ReverseInteger {

    public int reverse(int x) {
        // 当 x 为 -2147483648 时，之后乘 -1 会溢出，因此先转换为 long 类型
        long longX = (long) x;
        int sign = 1;
        if (x < 0) {
            sign = -1;
        }
        longX *= sign;
        String str = String.valueOf(longX);
        String resultStr = "";
        for (int i = str.length(); i > 0; i--) {
            resultStr += str.charAt(i-1);
        }
        long longResult = Long.parseLong(resultStr) * sign;
        if (longResult < Integer.MIN_VALUE || longResult > Integer.MAX_VALUE) {
            return 0;
        }
        return Integer.parseInt(resultStr) * sign;
    }
}
