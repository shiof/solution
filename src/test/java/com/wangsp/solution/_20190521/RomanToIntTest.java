package com.shiof.solution._20190521;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/21 16:10
 * @since
 */
public class RomanToIntTest {

    @Test
    public void test() {
        int i = new RomanToInt().solution("III");
        Assert.assertEquals(3, i);
    }

    @Test
    public void test2() {
        int i = new RomanToInt().solution("IV");
        Assert.assertEquals(4, i);
    }

    @Test
    public void test3() {
        int i = new RomanToInt().solution("MCMXCIV");
        Assert.assertEquals(1994, i);
    }
    @Test
    public void test4() {
        int i = new RomanToInt().solution("MDCCCLXXXIV");
        Assert.assertEquals(1884, i);
    }
}