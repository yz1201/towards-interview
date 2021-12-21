package cn.dbdj1201.interview.leetcode.work;

import lombok.Data;

/**
 * @Author: yz1201
 * @Date: 2021/12/20 15:56
 */
@Data
public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
