package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/11 14:46
 */
@Slf4j
public class RemoveNodeElementsTask {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        System.out.println(removeElementsCopy(n1, 1));

    }

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        while (head.val == val) {
            head = head.next;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            }

            cur = cur.next;
        }
        return head;
    }

    public static ListNode removeElements1(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        while (head.val == val) {
            head = head.next;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {

            }

            cur = cur.next;
        }
        return head;
    }

    public static ListNode removeElementsCopy(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElementsCopy(head.next, val);
        return head.val == val ? head.next : head;
    }


}
