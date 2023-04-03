package cn.dbdj1201.interview.leetcode.work.diffcult;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/2/23 16:21
 */
@Slf4j
public class D23 {

//    public ListNode mergeKLists(ListNode[] lists) {
////        List<Integer> nodeVals = Arrays.stream(lists).map(ListNode::getVal).sorted().collect(Collectors.toList());
//
//        List<Integer> nodeVals = new ArrayList<>();
//        for (int i = 0; i < lists.length; i++) {
//            ListNode list = lists[i];
//            nodeVals.add(list.getVal());
//            while (list.getNext() != null){
//                list = list.getNext();
//                nodeVals.add(list.getVal());
//            }
//        }
//
//        nodeVals = nodeVals.stream().sorted().collect(Collectors.toList());
//
////        for (int i = nodeVals.size() - 1; i >= 0; i--) {
////            ListNode listNode = new ListNode(i);
////            for (int i1 = nodeVals.size() - 2; i1 >= 0; i1--) {
////                ListNode listNode1 = new ListNode(i1);
////                listNode1.setNext(listNode);
////            }
////        }
//        // {1,2,3}
//
//        List<ListNode> listNodes = new ArrayList<>();
//        for (Integer nodeVal : nodeVals) {
//            listNodes.add(new ListNode(nodeVal));
//        }
//        for (int i = 0; i < listNodes.size(); i++) {
//            for (int i1 = i + 1; i1 < listNodes.size(); i1++) {
//                listNodes.get(i).setNext(listNodes.get(i + 1));
//            }
//        }
//        return listNodes.get(0);
//    }

    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = (aPtr != null ? aPtr : bPtr);
        return head.next;
    }

}
 class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
