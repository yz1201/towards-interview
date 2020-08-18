package cn.dbdj1201.interview;

import cn.dbdj1201.interview.utils.CollectionUtils;
import cn.dbdj1201.interview.utils.ILinkedList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-18 21:59
 **/
@Slf4j
public class Prob15 {
    public static void main(String[] args) {
        /*面试题 15：链表中倒数第 k 个结点
题目：输入一个链表，输出该链表中倒数第 k 个结点。为了符合大多数人的习惯，
本题从 1 开始计数，即链表的尾结点是倒数第一个结点。例如一个有 6 个结点的
链表，从头结点依次是 1,2,3,4，5,6。倒数第三个结点就是值为 4 的结点。*/
        ILinkedList list = CollectionUtils.generateList(6);
//        System.out.println(list);
//        System.out.println(list.size());
        list.show();
        System.out.println(list.deleteLastK(3));
        list.show();
    }

//    private static void test() {
//
//    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class ILinkedList15 {

    INode15 head;

    void add(INode15 node15) {

        if (this.head == null) {
            this.head = node15;
            return;
        }

        INode15 temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node15;

    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class INode15 {
    int num;
    INode15 next;

    public INode15(int num) {
        this.num = num;
    }
}
