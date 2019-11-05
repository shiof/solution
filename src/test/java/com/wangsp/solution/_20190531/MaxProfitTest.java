package com.shiof.solution._20190531;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/31 8:39
 * @since
 */
public class MaxProfitTest {
    @Test
    public void test1() {
        int solution = new MaxProfit().solution(new int[]{7, 1, 5, 3, 6, 4});
        Assert.assertEquals(7, solution);
    }

    @Test
    public void test2() {
        int solution = new MaxProfit().solution(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(4, solution);
    }

    @Test
    public void test3() {
        int solution = new MaxProfit().solution(new int[]{7, 6, 4, 3, 1});
        Assert.assertEquals(0, solution);
    }
}