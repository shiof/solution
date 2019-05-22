package com.shiof.solution._20190521;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * @author spwang on 2019/5/21 15:07
 * @version 1.0.0
 * @since 1.0.0
 */
public class Reverse {
    /**
     * @param x 整数
     * @return 返回整数的倒序
     */
    public int Solution(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
            x /= 10;
        }
        return rev;
    }
}
