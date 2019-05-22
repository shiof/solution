package com.shiof.solution._20190521;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/21 8:37
 * @since
 */
public class TwoNumTest {

    @Test
    public void solution() {
        TwoNum twoNum = new TwoNum();
        int[] result = twoNum.solution(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }

    @Test
    public void hasTwoResult() {
        TwoNum twoNum = new TwoNum();
        int[] result = twoNum.solution(new int[]{2, 7, 11, -2}, 9);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }
}