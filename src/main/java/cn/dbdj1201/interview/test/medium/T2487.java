package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.ListNode;
import cn.dbdj1201.interview.leetcode.work.middle.M2487;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2024/1/3 14:16
 */
public class T2487 {

    public static void main(String[] args) {
        M2487 m2487 = new M2487();


        ListNode listNode4 = new ListNode(8);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(13, listNode3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode listNode = new ListNode(5, listNode1);
        System.out.println(listNode);
        System.out.println(m2487.removeNodesCp2(listNode));

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(22);
        nums.add(32);
        nums.add(42);
        nums.add(50);

        List<Integer> collect = nums.stream().filter(num -> {
            if (num < 1000) {
                if (num > 30) return false;
                else if (num == 12) return true;
            }
            return true;
        }).collect(Collectors.toList());
        System.out.println(collect);

    }
}
