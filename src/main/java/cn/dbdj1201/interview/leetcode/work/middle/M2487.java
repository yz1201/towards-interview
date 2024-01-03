package cn.dbdj1201.interview.leetcode.work.middle;

import cn.dbdj1201.interview.leetcode.work.ListNode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: yz1201
 * @Date: 2024/1/3 14:02
 */
@Slf4j
public class M2487 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode removeNodes(ListNode head) {
        ListNode resHead = null;
        while (head.next != null) {
            if (head.next.val > head.val) {
                resHead = head.next;
            } else {
                if (resHead != null)
                    resHead.next = head.next;
                else
                    resHead = head.next;
            }
            head = head.next;
        }
        return resHead;
    }

    public ListNode removeNodesCp(ListNode head) {
        if (head == null) {
            return null;
        }
        head.next = removeNodesCp(head.next);
        if (head.next != null && head.val < head.next.val) {
            return head.next;
        } else {
            return head;
        }
    }


    public ListNode removeNodesCp2(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<ListNode>();
        for (; head != null; head = head.next) {
            stack.push(head);
        }
        for (; !stack.isEmpty(); stack.pop()) {
            if (head == null || stack.peek().val >= head.val) {
                stack.peek().next = head;
                head = stack.peek();
            }
        }
        return head;
    }

}

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
