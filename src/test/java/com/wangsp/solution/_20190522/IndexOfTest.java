package com.shiof.solution._20190522;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 * @author spwang on 2019/5/22 15:29
 * @since
 */
public class IndexOfTest {

    @Test
    public void test1() {
        int i = new IndexOf().solution("hello", "ll");
        Assert.assertEquals(2, i);
    }

    @Test
    public void test2() {
        System.out.println("mississippi".indexOf("issip"));
        int i = new IndexOf().solution("mississippi", "issip");
        Assert.assertEquals(4, i);
    }

    @Test
    public void test3() {
        int i = new IndexOf().solution("hello world", "world");
        Assert.assertEquals(6, i);
    }

    @Test
    public void test6() {
        int i = new IndexOf().solution("", "world");
        Assert.assertEquals(-1, i);
    }

    @Test
    public void test7() {
        int i = new IndexOf().solution(null, "world");
        Assert.assertEquals(-1, i);
    }

    @Test
    public void test8() {
        int i = new IndexOf().solution("hello world", null);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void test9() {
        int i = new IndexOf().solution(null, null);
        Assert.assertEquals(-1, i);
    }

    @Test
    public void test10() {
        int i = new IndexOf().solution("hello world", "");
        Assert.assertEquals(0, i);
    }

    @Test
    public void test11() {
        int i = new IndexOf().solution("", "");
        Assert.assertEquals(0, i);
    }
}