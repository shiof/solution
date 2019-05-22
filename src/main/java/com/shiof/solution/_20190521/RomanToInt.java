package com.shiof.solution._20190521;

import java.util.HashMap;

/**
 * 罗马数字转整数
 *
 * @author spwang on 2019/5/21 15:48
 * @version 1.0.0
 * @since 1.0.0
 */
public class RomanToInt {
    private static HashMap<String, Integer> map = new HashMap<>();
    static {
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
    }

    public int solution(String s) {
        int sum = 0;
        for (int i = s.length() -1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': if (sum < 5){ sum += 1;} else { sum -= 1;}; break;
                case 'V': sum += 5; break;
                case 'X': if (sum < 50){ sum += 10;} else { sum -= 10;}; break;
                case 'L': sum += 50; break;
                case 'C': if (sum < 500){ sum += 100;} else { sum -= 100;}; break;
                case 'D': sum += 500; break;
                case 'M': sum += 1000; break;
            }
        }
        return sum;
    }


    public int solution3(String s) {
        int sum = 0;
        int i = 0;
        char[] chars = s.toCharArray();
        while (i < chars.length) {
            int currentNum = map.get(String.valueOf(chars[i]));
            if ((chars[i] == 'I' || chars[i] == 'X' || chars[i] == 'C') && i < chars.length - 1) {
                int nextNum = map.get(String.valueOf(chars[i + 1]));
                if (currentNum < nextNum) {
                    sum += map.get(String.valueOf(chars[i]) + String.valueOf(chars[i + 1]));
                    i += 2;
                    continue;
                }
            }
            sum += currentNum;
            i++;
        }
        return sum;
    }

    public int solution2(String s) {
        int sum = 0;
        int i = 0;
        char[] chars = s.toCharArray();
        while (i < chars.length) {
            if (i < chars.length - 1) {
                int specialNumber = specialNumber(String.valueOf(chars[i]) + String.valueOf(chars[i + 1]));
                if (specialNumber != 0) {
                    sum += specialNumber;
                    i += 2;
                    continue;
                }
            }
            switch (chars[i]) {
                case 'I': sum += 1; break;
                case 'V': sum += 5; break;
                case 'X': sum += 10; break;
                case 'L': sum += 50; break;
                case 'C': sum += 100; break;
                case 'D': sum += 500; break;
                case 'M': sum += 1000; break;
            }
            i++;
        }
        return sum;
    }

    private int specialNumber(String s){
        switch (s) {
            case "IV": return 4;
            case "IX": return 9;
            case "XL": return 40;
            case "XC": return 90;
            case "CD": return 400;
            case "CM": return 900;
            default: return 0;
        }
    }
}
