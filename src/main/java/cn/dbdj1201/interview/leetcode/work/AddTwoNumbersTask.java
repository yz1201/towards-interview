package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/12/31 14:00
 */
@Slf4j
public class AddTwoNumbersTask {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(3);
        ListNode r4 = new ListNode(4);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        //4331 721   5052

        //[1,9,9,9,9,9,9,9,9,9]
//        System.out.println(getNodeValue(r1));
        System.out.println(addTwoNumbersCopy(l1, r1));
        System.out.println(addTwoNumbers1(l1, r1));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = getNodeValue(l1);
        int num2 = getNodeValue(l2);
        int res = num1 + num2;
        System.out.println(res);
        String resStr = String.valueOf(res);
        int len = resStr.length();
        List<ListNode> nodes = new ArrayList<>();

        for (int i = len - 1; i >= 0; i--) {
            int val = resStr.charAt(i) - '0';
            nodes.add(new ListNode(val));
        }

        System.out.println(nodes);

        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }
        return nodes.get(0);
    }

    private static int getNodeValue(ListNode curNode) {
        if (curNode == null) {
            return -1;
        }
        ListNode cur = curNode;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val);
            cur = cur.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }


    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;

        int len1 = getNodeLength(l1);
        int len2 = getNodeLength(l2);

        if (len1 >= len2) {
            while (cur1 != null || cur2 != null) {
                if (cur2 != null && cur1 != null) {
                    cur1.val = cur1.val + cur2.val;
                    cur1 = cur1.next;
                    cur2 = cur2.next;
                } else if (cur2 == null) {
                    cur1 = cur1.next;
                }
            }
            return l1;
        } else {
            while (cur1 != null || cur2 != null) {
                if (cur2 != null && cur1 != null) {
                    cur2.val = cur1.val + cur2.val;
                    cur1 = cur1.next;
                    cur2 = cur2.next;
                } else if (cur1 == null) {
                    cur2 = cur2.next;
                }
            }
            return l2;
        }
    }

    public static ListNode addTwoNumbersCopy(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    private static int getNodeLength(ListNode node) {
        ListNode cur = node;

        if (cur == null) {
            return 0;
        }
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
