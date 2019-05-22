package com.shiof.solution._20190522;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/22 8:39
 * @since
 */
public class ValidBracketsTest {
    @Test
    public void test1() {
        boolean b = new ValidBrackets().solution("()");
        Assert.assertTrue(b);
    }

    @Test
    public void test2() {
        boolean b = new ValidBrackets().solution("()[]{}");
        Assert.assertTrue(b);
    }

    @Test
    public void test3() {
        boolean b = new ValidBrackets().solution("(]");
        Assert.assertFalse(b);
    }

    @Test
    public void test4() {
        boolean b = new ValidBrackets().solution("{[]}");
        Assert.assertTrue(b);
    }

    @Test
    public void test5() {
        boolean b = new ValidBrackets().solution("([)]");
        Assert.assertFalse(b);
    }
    @Test
    public void test6() {
        boolean b = new ValidBrackets().solution("");
        Assert.assertTrue(b);
    }
    @Test
    public void test7() {
        boolean b = new ValidBrackets().solution("]");
        Assert.assertFalse(b);
    }

}