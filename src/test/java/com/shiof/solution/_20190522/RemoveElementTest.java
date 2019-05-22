package com.shiof.solution._20190522;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/22 15:06
 * @since
 */
public class RemoveElementTest {

    @Test
    public void test1() {
        int[] nums = {3, 2, 2, 3};
        int i = new RemoveElement().solution(nums, 2);
        Assert.assertEquals(2, i);
        assertResult(nums, i, new int[]{3, 3});
    }

    @Test
    public void test2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int i = new RemoveElement().solution(nums, 2);
        Assert.assertEquals(5, i);
        assertResult(nums, i, new int[]{0, 1, 3, 0, 4});
    }

    private void assertResult(int[] nums, int expectedLen, int[] expected) {
        for (int i = 0; i < expectedLen; i++) {
            Assert.assertEquals(expected[i], nums[i]);
        }
    }
}