package com.shiof.solution._20190521;

import com.shiof.solution.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author spwang on 2019/5/21 9:19
 * @since
 */
public class AddTwoNumbersTest {

    @Test
    public void test() {
        ListNode l1 = new ListNode(new int[]{2,4,3});
        ListNode l2 = new ListNode(new int[]{5,6,4});

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode solution = addTwoNumbers.solution(l1, l2);

        int[] expected = new int[]{7, 0, 8};
        int i = 0;
        while (solution != null) {
            Assert.assertEquals(expected[i++], solution.val);
            solution = solution.next;
        }
    }


    @Test
    public void test2() {
        ListNode l1 = new ListNode(new int[]{9});
        ListNode l2 = new ListNode(new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9});

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode solution = addTwoNumbers.solution(l1, l2);

        int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int i = 0;
        while (solution != null) {
            Assert.assertEquals(expected[i++], solution.val);
            solution = solution.next;
        }
    }
}