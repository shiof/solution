package com.shiof.solution._20190522;

import com.shiof.solution.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

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

    @Test
    public void test5() {
        int size = 1000;
        int[] list1 = new int[size];
        int[] list2 = new int[size];
        for (int i = 0; i < size; i++) {
            list1[i] = (int) (Math.random() * 100);
            list2[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
        long start = System.currentTimeMillis();
        ListNode node = new MergeTwoLists().solution(new ListNode(list1), new ListNode(list2));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(node.toString());
    }

    private void assertResult(ListNode node, ListNode expectedList) {
        while (node != null) {
            Assert.assertEquals(expectedList.val, node.val);
            expectedList = expectedList.next;
            node = node.next;
        }
    }
}