package com.shiof.solution._20190529;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/29 8:28
 * @since
 */
public class PlusOneTest {

    @Test
    public void test1() {
        int[] solution = new PlusOne().solution(new int[]{1, 2, 3, 4});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 5}, solution);
    }

    @Test
    public void test2() {
        int[] solution = new PlusOne().solution(new int[]{9, 9});
        Assert.assertArrayEquals(new int[]{1, 0, 0}, solution);
    }
}