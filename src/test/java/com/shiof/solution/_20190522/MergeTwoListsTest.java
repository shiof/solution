package com.shiof.solution._20190522;

import com.shiof.solution._20190522.MergeTwoLists;
import com.shiof.solution.common.ListNode;
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

        System.out.println(node.toString());

        ListNode expectedList = new ListNode(new int[]{1, 1, 2, 3, 4, 4});
        assertResult(node, expectedList);
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(new int[]{1, 2, 4});
        ListNode l2 = new ListNode(new int[]{1, 3, 4, 5, 6});
        ListNode node = new MergeTwoLists().solution(l1, l2);

        System.out.println(node.toString());

        ListNode expectedList = new ListNode(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertResult(node, expectedList);
    }

    @Test
    public void test3() {
        ListNode l2 = new ListNode(new int[]{1, 3, 4, 5, 6});
        ListNode node = new MergeTwoLists().solution(null, l2);
        System.out.println(node.toString());
        assertResult(node, l2);
    }

    @Test
    public void test4() {
        ListNode node = new MergeTwoLists().solution(null, null);
        assertResult(null, null);
    }

    private void assertResult(ListNode node, ListNode expectedList) {
        while (node != null) {
            Assert.assertEquals(expectedList.val, node.val);
            expectedList = expectedList.next;
            node = node.next;
        }
    }
}