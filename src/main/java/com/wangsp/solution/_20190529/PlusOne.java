package com.shiof.solution._20190529;

/**
 * <a href="https://leetcode-cn.com/problems/plus-one/">66. 加一</a>
 *
 * <p>
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * @author spwang on 2019/5/29 8:20
 * @version 1.0.0
 * @since 1.0.0
 */
public class PlusOne {
    public int[] solution(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            digits[i] = ++digits[i] % 10;
            if (digits[i--] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
