package cn.dbdj1201.interview.problems;

import cn.dbdj1201.interview.utils.CollectionUtils;
import cn.dbdj1201.interview.utils.ILinkedList;
import cn.dbdj1201.interview.utils.INode;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: dbdj1201
 * @Date: 2020-08-19 18:18
 */
@Slf4j
public class Prob16 {

    public static void main(String[] args) {
        /*
                    面试题 16 ：反转链表
                题目：定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的
                头结点。
        */

        ILinkedList list = CollectionUtils.generateList(5);
        list.show();

        INode reverse = reverse(list.getHead());
        System.out.println(reverse);

        log.info(" =================== ");
        while (reverse != null) {
            System.out.println(reverse);
            reverse = reverse.getNext();
        }
    }

    private static INode reverse(INode head) {
        if (head == null) {
            System.out.println("?");
            return null;
        }

        if (head.getNext() == null) {
            return head;
        }

        INode temp = head;
        INode preNode = null;
//        INode result = null;
        while (temp.getNext() != null) {
            INode postNode = temp.getNext();
//            if (postNode == null) {
//                result = postNode;
//            }
            temp.setNext(preNode);
            preNode = temp;
            temp = postNode;
        }
        temp.setNext(preNode);
        return temp;
    }


}
