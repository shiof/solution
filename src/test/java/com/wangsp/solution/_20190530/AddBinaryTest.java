package com.shiof.solution._20190530;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/30 9:49
 * @since
 */
public class AddBinaryTest {
    @Test
    public void test1() {
        String solution = new AddBinary().solution("1000", "1001");
        Assert.assertEquals("10001", solution);
    }

    @Test
    public void test2() {
        String solution = new AddBinary().solution("1010", "1011");
        Assert.assertEquals("10101", solution);
    }

    @Test
    public void test3() {
        String solution = new AddBinary().solution("1011", "1001");
        Assert.assertEquals("10100", solution);
    }

    @Test
    public void test4() {
        String solution = new AddBinary().solution("11", "1001");
        Assert.assertEquals("1100", solution);
    }
}