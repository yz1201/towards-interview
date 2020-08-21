package cn.dbdj1201.interview.problems;

import cn.dbdj1201.interview.utils.CollectionUtils;
import cn.dbdj1201.interview.utils.ILinkedList;
import cn.dbdj1201.interview.utils.INode;

/**
 * @Author: dbdj1201
 * @Date: 2020-08-19 19:04
 */
public class Prob17 {
    public static void main(String[] args) {

        /*
                面试题 17 ：合并两个排序的链表
            题目：输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按
            照递增排序的。
        */
        ILinkedList list = CollectionUtils.generateList(3);
        ILinkedList list1 = CollectionUtils.generateList(5);


        test(list1, list).show();

    }

    private static ILinkedList test(ILinkedList l1, ILinkedList l2) {
        ILinkedList list = new ILinkedList();

        INode left = l1.getHead();
        INode right = l2.getHead();

        if (left == null) {
            return l2;
        }

        if (right == null) {
            return l1;
        }

        while (right != null) {
            list.sortedAdd(new INode(right.getNum()));
            right = right.getNext();
        }

        while (left != null) {
            list.sortedAdd(new INode(left.getNum()));
            left = left.getNext();
        }

        return list;
    }
}
