package cn.dbdj1201.interview.thread;

import cn.dbdj1201.interview.leetcode.work.CBTInserter;
import cn.dbdj1201.interview.leetcode.work.CBTInserterV1;
import cn.dbdj1201.interview.leetcode.work.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/7/25 15:00
 */
@Slf4j
public class TestMain20220725 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;

        System.out.println(root);


        CBTInserterV1 inserter = new CBTInserterV1(root);
//        inserter.insert(1);
//        inserter.insert(2);
//        inserter.insert(3);
//        inserter.insert(4);
        inserter.insert(5);
        inserter.insert(6);
        inserter.insert(7);
        System.out.println(inserter.get_root());
    }
}
