package com.shiof.solution._20190522;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/22 16:45
 * @since
 */
public class SearchInsertTest {
    @Test
    public void test1() {
        int i = new SearchInsert().solution(new int[]{1, 3, 5, 6}, 5);
        Assert.assertEquals(2, i);
    }

    @Test
    public void test2() {
        int i = new SearchInsert().solution(new int[]{1, 3, 5, 6}, 7);
        Assert.assertEquals(4, i);
    }

    @Test
    public void test3() {
        int i = new SearchInsert().solution(new int[]{1, 3, 5, 6}, 0);
        Assert.assertEquals(0, i);
    }

    @Test
    public void test4() {
        int i = new SearchInsert().solution(new int[]{1, 3, 5, 6}, 2);
        Assert.assertEquals(1, i);
    }
}