package com.shiof.solution.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/22 9:29
 * @since 1.0.0
 */
public class MergeTwoListsTest {

    @Test
    public void test1() {
        ListNode l1 = new ListNode(new int[]{1, 2, 4});
        ListNode l2 = new ListNode(new int[]{1, 3, 4});
        ListNode node = new MergeTwoLists().solution(l1, l2);

        ListNode expectedList = new ListNode(new int[]{1, 1, 2, 3, 4, 4});
        while (node != null) {
            Assert.assertEquals(expectedList.val, node.val);
            expectedList = expectedList.next;
            node = node.next;
        }
    }
}