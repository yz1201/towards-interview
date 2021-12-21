package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/20 15:54
 */
@Slf4j
public class TwoSortedLinkedListMerge {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(10);
        ListNode l6 = new ListNode(12);

        l1.next = l2;
        l2.next = l6;
        l6.next = null;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        System.out.println(l1);
        System.out.println(l3);

        ListNode resultNode = mergeTwoLists(l1, l3);

        System.out.println(resultNode);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
}
