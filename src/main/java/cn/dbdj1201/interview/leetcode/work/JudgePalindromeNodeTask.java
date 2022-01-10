package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/10 14:58
 */
@Slf4j
public class JudgePalindromeNodeTask {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(isPalindrome(n1));

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur!=null){
            sb.append(cur.val);
            cur =cur.next;
        }
        String content = sb.toString();
        System.out.println(content);
        sb.reverse();
        System.out.println(sb);
        return sb.toString().equals(content);
    }
}
