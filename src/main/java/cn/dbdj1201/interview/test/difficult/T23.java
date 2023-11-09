package cn.dbdj1201.interview.test.difficult;

import cn.dbdj1201.interview.leetcode.work.ListNode;
import cn.dbdj1201.interview.leetcode.work.diffcult.D23;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/4/3 14:32
 */
@Slf4j
public class T23 {

    public static void main(String[] args) {
        D23 d23 =new D23();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        ListNode l9 = new ListNode(9);

        l1.setNext(l5);
        l5.setNext(l9);

        l2.setNext(l3);
        l3.setNext(l4);

        l8.setNext(l7);
        l7.setNext(l6);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l8);
        List<ListNode> nodeList = new ArrayList<>();
        nodeList.add(l1);
        nodeList.add(l2);
        nodeList.add(l8);
        System.out.println(nodeList);

        ListNode[] nodes = {l1,l2,l8};
//        d23.mergeKLists(nodes);
        System.out.println(new ListNode());
    }
}
