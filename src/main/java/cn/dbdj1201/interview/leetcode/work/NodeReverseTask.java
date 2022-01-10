package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ListIterator;

/**
 * @Author: yz1201
 * @Date: 2022/1/10 14:04
 */
@Slf4j
public class NodeReverseTask {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(reverseListCopy1(n1));
    }

    public static ListNode reverseListCopy(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static ListNode reverseListCopy1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListCopy1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
