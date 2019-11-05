package com.shiof.solution._20190522;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author spwang on 2019/5/22 17:14
 * @since
 */
public class LengthOfLastWordTest {

    @Test
    public void test1() {
        int i = new LengthOfLastWord().solution("Hello World");
        Assert.assertEquals(5, i);
    }

    @Test
    public void test2() {
        int i = new LengthOfLastWord().solution("");
        Assert.assertEquals(0, i);
    }

    @Test
    public void test3() {
        int i = new LengthOfLastWord().solution(" a");
        Assert.assertEquals(1, i);
    }

    @Test
    public void test4() {
        int i = new LengthOfLastWord().solution("a ");
        Assert.assertEquals(1, i);
    }

    @Test
    public void test5() {
        int i = new LengthOfLastWord().solution(" ");
        Assert.assertEquals(0, i);
    }

    @Test
    public void test6() {
        int i = new LengthOfLastWord().solution("     ");
        Assert.assertEquals(0, i);
    }
}