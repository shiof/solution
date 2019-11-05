package com.shiof.solution._20190530;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/30 15:21
 * @since
 */
public class ClimbStairsTest {

    @Test
    public void solution() {
        int solution = new ClimbStairs().solution(30);
        Assert.assertEquals(1346269, solution);
    }

    @Test
    public void solution2() {
        int solution = new ClimbStairs().solution2(30);
        Assert.assertEquals(1346269, solution);
    }
}