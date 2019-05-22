package com.shiof.solution._20190521;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。  如果不存在公共前缀，返回空字符串 ""。
 *
 * @author spwang on 2019/5/21 17:26
 * @version 1.0.0
 * @since 1.0.0
 */
public class LongestCommonPrefix {

    public String solution3(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    public String solution2(String[] strs){
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public String solution(String[] strs){
        if (strs.length == 0) return "";
        String shortestStr = strs[0];
        for (String s : strs) {
            if (shortestStr.length() > s.length()) {
                shortestStr = s;
            }
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < shortestStr.length(); i++) {
            char current = shortestStr.charAt(i);
            int num = 0;
            for (String str : strs) {
                if (current != str.charAt(i)) {
                    break;
                }
                num++;
            }
            if (num != strs.length) break;
            sb.append(current);
        }
        return sb.toString();
    }
}
