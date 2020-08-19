package cn.dbdj1201.interview.problems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-15 11:34
 **/
@Slf4j
public class Prob13 {
    public static void main(String[] args) {
        /*
            面试题 13：在 O（1）时间-----删除链表结点
        题目：
            给定单向链表的头指针和一个结点指针，定义一个函数在 O(1)时间删除
        该结点。
        */
        LinkedList13 list = generateList();
        System.out.println(list);
        INode13 next = list.head.next;
        System.out.println(delete(list.head, list.head));
//        System.out.println(list);


    }

    private static INode13 delete(INode13 head, INode13 node13) {
        INode13 temp = head;
        if (temp == node13) {
            head = temp.next;
            return head;
        }
        while (temp.next != node13) {
            temp = temp.next;
        }
        temp.next = node13.next;
        return head;
    }

    private static LinkedList13 generateList() {
        INode13 node1 = new INode13(1);
        INode13 node2 = new INode13(2);
        INode13 node3 = new INode13(3);
        INode13 node4 = new INode13(4);
        LinkedList13 list = new LinkedList13();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        return list;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class LinkedList13 {

    INode13 head;

    void add(INode13 node13) {
        if (this.head == null) {
            head = node13;
            return;
        }

        INode13 temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node13;
    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class INode13 {

    int num;

    INode13 next;

    public INode13(int num) {
        this.num = num;
    }

//    @Override
//    public String toString() {
//        return "INode13{" +
//                "num=" + num +
//                '}';
//    }
}
