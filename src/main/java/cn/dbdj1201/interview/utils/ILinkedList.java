package cn.dbdj1201.interview.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-18 22:05
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class ILinkedList {

    INode head;

    void add(INode node) {

        if (this.head == null) {
            this.head = node;
            return;
        }

        INode temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

    }

    public INode deleteLastK(int k) {
        int len = size() - k;
        INode temp = this.head;
        if (len <= 0) {
            this.head = this.head.next;
            return temp;
        }

        for (int i = 0; i < len - 1; i++) {
            temp = temp.next;
        }
        INode result = temp.next;
        temp.next = temp.next.next;
        return result;
    }

    public int size() {
        int size = 0;
        INode temp = this.head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public void show() {
        StringBuilder sb = new StringBuilder();
        INode temp = this.head;
        while (temp != null) {
            sb.append(temp).append(" -> ");
            temp = temp.next;
        }
//        sb.deleteCharAt(sb.lastIndexOf(" "));
//        sb.deleteCharAt(sb.lastIndexOf("-"));
//        sb.deleteCharAt(sb.lastIndexOf(">"));
//        sb.deleteCharAt(sb.lastIndexOf(" "));
        sb.delete(sb.lastIndexOf("-"), sb.length());

//        sb.substring();
//        sb.substring(sb.lastIndexOf(" -> "));
        System.out.println(sb.toString());
    }

    public void sortedAdd(INode node) {
        if (this.head == null) {
            this.head = node;
            return;
        }

        if (this.head.num > node.num) {
            INode temp = this.head;
            this.head = node;
            node.next = temp;
        }

        INode temp = this.head;
        while (temp.next != null) {
            if (node.num < temp.next.num) {
                node.next = temp.next;
                temp.next = node;
                return;
            }else {
                temp = temp.next;
            }
        }
        temp.next = node;
    }

    public static void main(String[] args) {
        INode iNode1 = new INode(1);
        INode iNode2 = new INode(3);
        INode iNode3 = new INode(2);
        INode iNode4 = new INode(4);

        ILinkedList list = new ILinkedList();

        list.sortedAdd(iNode1);
        list.sortedAdd(iNode2);
        list.sortedAdd(iNode3);
        list.sortedAdd(iNode4);

        list.show();
    }

//    public INode reverse() {
//        INode result;
//        INode temp = this.head;
//        INode preNode = temp;
//        if (head == null) {
//            System.out.println("?");
//            return null;
//        }
//
//
//        while (temp != null) {
//            temp = temp.next;
//
//            preNode.next = null;
//
//        }
//
//        return null;
//    }

//    @Data
//    @AllArgsConstructor
//    @NoArgsConstructor
//    static class INode {
//        int num;
//        INode next;
//
//        public INode(int num) {
//            this.num = num;
//        }
//
//        @Override
//        public String toString() {
//            return "INode{" +
//                    "num=" + num +
//                    '}';
//        }
//    }

}

