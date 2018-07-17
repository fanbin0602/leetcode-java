package me.fanbin.leetcode.s0013;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 13. Roman to Integer
 * @author fanbin
 * @date 2018-07-17
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<String, Integer>(){
            {
                put("I", 1);
                put("V", 5);
                put("X", 10);
                put("L", 50);
                put("C", 100);
                put("D", 500);
                put("M", 1000);
            }
        };
        List<String> romanSplitResult = new ArrayList<String>();
        String temp = "";
        for (char c : s.toCharArray()) {
            if (!roman.keySet().contains(String.valueOf(c))) {
                continue;
            }
            if (temp.length() == 0) {
                temp += c;
            } else {
                String last = String.valueOf(temp.charAt(temp.length() -1));
                if (roman.get(last) < roman.get(String.valueOf(c))) {
                    temp += c;
                } else {
                    romanSplitResult.add(temp);
                    temp = "" + c;
                }
            }

        }
        romanSplitResult.add(temp);
        int result = 0;
        for (String string : romanSplitResult) {
            if (string.length() == 1) {
                result += roman.get(string);
            } else if (string.length() == 2) {
                result += (roman.get(String.valueOf(string.charAt(1))) - roman.get(String.valueOf(string.charAt(0))));
            }
        }
        return result;
    }

}
