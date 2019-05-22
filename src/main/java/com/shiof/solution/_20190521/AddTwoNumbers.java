package com.shiof.solution._20190521;

import com.shiof.solution.common.ListNode;

import java.math.BigDecimal;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。  您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author spwang on 2019/5/21 8:58
 * @version 1.0.0
 * @since 1.0.0
 */
public class AddTwoNumbers {
    /**
     * 两个的整数相加
     *
     * @param l1 整数的逆序
     * @param l2 整数的逆序
     * @return 两个整数相加的和
     */
    public ListNode solution(ListNode l1, ListNode l2) {
        return integerToReverseNode(nodeToReverseBigDecimal(l1).add(nodeToReverseBigDecimal(l2)).setScale(0).toString());
    }

    /**
     * 两个的整数相加
     *
     * @param l1 整数的逆序
     * @param l2 整数的逆序
     * @return 两个整数相加的和
     */
    public ListNode solution2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    private ListNode integerToReverseNode(String i) {
        char[] chars = i.toCharArray();
        int j = chars.length - 2;
        ListNode header = new ListNode(Integer.parseInt(String.valueOf(chars[chars.length - 1])));
        ListNode next = header;
        while (j >= 0) {
            ListNode temp = new ListNode(Integer.parseInt(String.valueOf(chars[j--])));
            next.next = temp;
            next = temp;
        }
        return header;
    }

    private BigDecimal nodeToReverseBigDecimal(ListNode node) {
        int i = 0;
        BigDecimal sum = new BigDecimal(0);
        while (node != null) {
            sum = sum.add(BigDecimal.valueOf(node.val * Math.pow(10, i++)));
            node = node.next;
        }
        return sum;
    }
}

