package com.shiof.solution._20190521;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/21 15:11
 * @since
 */
public class ReverseTest {
    @Test
    public void test() {
        int i = new Reverse().Solution(100);
        Assert.assertEquals(1, i);
    }
    @Test
    public void test2() {
        int i = new Reverse().Solution(Integer.MAX_VALUE + 1);
        Assert.assertEquals(0, i);
    }
    @Test
    public void test3() {
        int i = new Reverse().Solution(-321);
        Assert.assertEquals(-123, i);
    }
}