package com.shiof.solution._20190530;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/30 11:01
 * @since
 */
public class MySqrtTest {
    @Test
    public void test1() {
        int i = new MySqrt().solution(8);
        Assert.assertEquals(2, i);
    }

    @Test
    public void test2() {
        int i = new MySqrt().solution(0);
        Assert.assertEquals(0, i);
    }

    @Test
    public void test3() {
        int i = new MySqrt().solution(1);
        Assert.assertEquals(1, i);
    }

    @Test
    public void test4() {
        int i = new MySqrt().solution(2147395600);
        Assert.assertEquals(46340, i);
    }

    @Test
    public void test5() {
        int i = new MySqrt().solution(2147483647);
        Assert.assertEquals(46340, i);
    }
}