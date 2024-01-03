package cn.dbdj1201.interview.leetcode.work;

import lombok.Data;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/12/20 15:56
 */
@Data
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
