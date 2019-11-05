package com.shiof.solution._20190522;

/**
 * <a href="https://leetcode-cn.com/problems/length-of-last-word/">58. 最后一个单词的长度</a>
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 *
 * @author spwang on 2019/5/22 17:12
 * @version 1.0.0
 * @since 1.0.0
 */
public class LengthOfLastWord {
    public int solution(String s) {
        if (s.isEmpty()) return 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - 1 - i;
            }
            if (i == 0) {
                return s.length();
            }
        }
        return 0;
    }
}
