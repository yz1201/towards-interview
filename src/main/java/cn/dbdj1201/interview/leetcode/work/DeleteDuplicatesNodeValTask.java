package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/27 16:52
 */
@Slf4j
public class DeleteDuplicatesNodeValTask {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
//        ListNode n4 = new ListNode(1);
//        ListNode n5 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        System.out.println(n1);
        System.out.println(deleteDuplicates1(n1));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int currentVal = head.val;
        while (temp.next != null) {
            if (currentVal == temp.next.val) {
                temp.next = temp.next.next;
            }

            if (temp.next != null) {
                temp = temp.next;
                currentVal = temp.val;
            }
        }
        return head;
    }

    public static ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int currentVal = head.val;
        while (temp != null) {
            if (temp.next != null && currentVal == temp.next.val) {
                temp.next = temp.next.next;
            }
            currentVal = temp.val;
            temp = temp.next;
        }
        return head;
    }

    public static ListNode deleteDuplicatesCopy(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
