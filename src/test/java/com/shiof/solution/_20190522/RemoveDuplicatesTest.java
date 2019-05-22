package com.shiof.solution._20190522;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/22 11:26
 * @since
 */
public class RemoveDuplicatesTest {

    @Test
    public void test1() {
        int[] nums = {1, 1, 2};
        int i = new RemoveDuplicates().solution(nums);

        int[] expectedResult = {1, 2};
        assertResult(nums, i, expectedResult);
    }

    @Test
    public void test2() {
        int[] nums = {-3, -1, 0, 0, 0, 3, 3};
        int i = new RemoveDuplicates().solution(nums);

        int[] expectedResult = {-3, -1, 0, 3};
        assertResult(nums, i, expectedResult);
    }

    private void assertResult(int[] nums, int expectedLen, int[] expected) {
        for (int i = 0; i < expectedLen; i++) {
            Assert.assertEquals(expected[i], nums[i]);
        }
    }
}