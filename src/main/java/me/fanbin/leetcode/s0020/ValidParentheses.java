package me.fanbin.leetcode.s0020;

import java.util.Arrays;
import java.util.List;

/**
 * 20. Valid Parentheses
 * @author fanbin
 * @date 2018-07-17
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        List<String> startSymbol = Arrays.asList("(", "[", "{");
        List<String> endSymbol = Arrays.asList(")", "]", "}");
        String waitMatch = "";

        for (char c : s.toCharArray()) {
            String symbol = String.valueOf(c);
            if (startSymbol.contains(symbol)) {
                waitMatch += symbol;
            } else {
                try {
                    String lastWait = waitMatch.substring(waitMatch.length() - 1);
                    if (startSymbol.indexOf(lastWait) != endSymbol.indexOf(symbol)) {
                        return false;
                    }
                    waitMatch = waitMatch.substring(0, waitMatch.length() - 1);
                } catch (StringIndexOutOfBoundsException e) {
                    return false;
                }
            }
        }
        
        return waitMatch.length() == 0;
    }
    
}
