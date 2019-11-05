package com.shiof.solution._20190529;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/29 16:10
 * @since
 */
public class MaxSubArrayTest {

    @Test
    public void test1() {
        int i = new MaxSubArray().solution(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assert.assertEquals(6, i);
    }

    @Test
    public void test2() {
        int i = new MaxSubArray().solution(new int[]{10, -1, 1, 2, -1, -2, -1, -5, 4});
        Assert.assertEquals(12, i);
    }

    @Test
    public void test3() {
        int i = new MaxSubArray().solution(new int[]{1});
        Assert.assertEquals(1, i);
    }

    @Test
    public void test4() {
        int i = new MaxSubArray().solution(new int[0]);
        Assert.assertEquals(0, i);
    }

    @Test
    public void test5() {
        int i = new MaxSubArray().solution(new int[]{-1, 0, -2, 2});
        Assert.assertEquals(2, i);
    }

    @Test
    public void test6() {
        int i = new MaxSubArray().solution(new int[]{-2, 1});
        Assert.assertEquals(1, i);
    }

    @Test
    public void test7() {
        int i = new MaxSubArray().solution(new int[]{-1, -2});
        Assert.assertEquals(-1, i);
    }

    @Test
    public void test8() {
        int i = new MaxSubArray().solution(new int[]{-2, -3, -1});
        Assert.assertEquals(-1, i);
    }

    @Test
    public void test9() {
        int i = new MaxSubArray().solution(new int[]{31, -41, 59, 26, -53, 58, 97, -93, -23, 84});
        Assert.assertEquals(187, i);
    }
}