package com.shiof.solution._20190530;

/**
 * <a href="https://leetcode-cn.com/problems/sqrtx/">69. x 的平方根</a>
 * <p>
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * @author spwang on 2019/5/30 10:55
 * @version 1.0.0
 * @since 1.0.0
 */
public class MySqrt {
    public int solution(int x) {
        if (x == 0) return 0;
        int left = 1, right = x, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (x / mid == mid) {
                return mid;
            }
            if (x / mid < mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (x / left < left) {
            return left - 1;
        }
        return left;
    }
}
