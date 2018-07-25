package me.fanbin.leetcode.s0038;

/**
 * 38. Count and Say
 * @author fanbin
 * @date 2018/7/25
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n < 1) {
            return null;
        }
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                result = "1";
                continue;
            }
            String currentResult = "";
            int currentNumber = 0;
            int currentCount = 0;
            for (String str : result.split("")) {
                int number = Integer.parseInt(str);
                if (number != currentNumber && currentCount != 0) {
                    currentResult += String.valueOf(currentCount);
                    currentResult += String.valueOf(currentNumber);
                    currentNumber = number;
                    currentCount = 1;
                    continue;
                }
                currentNumber = number;
                currentCount++;
            }
            result = currentResult + String.valueOf(currentCount) + String.valueOf(currentNumber);
        }
        return result;
    }

}
