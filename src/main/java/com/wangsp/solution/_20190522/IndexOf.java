package com.shiof.solution._20190522;

/**
 * <a href="https://leetcode-cn.com/problems/implement-strstr/">28. 实现strStr()</a>
 * <p>
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * @author spwang on 2019/5/22 15:26
 * @version 1.0.0
 * @since 1.0.0
 */
public class IndexOf {
    public int solution(String haystack, String needle) {
        if (null == haystack || null == needle || haystack.length() < needle.length()) return -1;
        if ("".equals(needle) || haystack.equals(needle)) return 0;

        int index = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(index)) {
                index++;
            } else {
                i -= index;
                index = 0;
            }
            if (index == needle.length()) return i - index + 1;
        }
        return -1;
    }
}
