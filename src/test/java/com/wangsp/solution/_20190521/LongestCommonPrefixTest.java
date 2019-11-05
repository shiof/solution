package com.shiof.solution._20190521;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/21 17:43
 * @since
 */
public class LongestCommonPrefixTest {

    @Test
    public void test1() {
        String s = new LongestCommonPrefix().solution(new String[]{"flower", "flow", "flight"});
        Assert.assertEquals("fl", s);
    }

    @Test
    public void test2() {
        String s = new LongestCommonPrefix().solution(new String[]{"dog","racecar","car"});
        Assert.assertEquals("", s);
    }
}