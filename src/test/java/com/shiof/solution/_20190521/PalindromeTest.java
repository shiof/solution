package com.shiof.solution._20190521;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/21 15:34
 * @since
 */
public class PalindromeTest {
    @Test
    public void test1(){
        boolean b = new Palindrome().solution(111);
        Assert.assertTrue(b);
    }

    @Test
    public void test2(){
        boolean b = new Palindrome().solution(123);
        Assert.assertFalse(b);
    }

    @Test
    public void test3(){
        boolean b = new Palindrome().solution(-121);
        Assert.assertTrue(b);
    }
}