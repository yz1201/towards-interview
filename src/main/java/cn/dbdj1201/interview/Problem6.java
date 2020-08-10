package cn.dbdj1201.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: dbdj1201
 * @Date: 2020-08-10 19:18
 */
//@Slf4j
public class Problem6 {

    public static void main(String[] args) {
        /*
        输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设前序遍历和中序遍历结果中都不包含重复的数字，例如输入的前序遍历序列
        {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}重建出如图所示的二叉树
        */
//        log.info();

        BinaryTree binaryTree = generateTree();
        binaryTree.preOrder();
    }

    private static BinaryTree generateTree() {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node3.right = node5;


        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = node1;
        return binaryTree;
    }
}

@Data
//@Slf4j
@AllArgsConstructor
@NoArgsConstructor
class TreeNode {
    //实例数据
    int num;
    //左子节点
    TreeNode left;
    //右子节点
    TreeNode right;

    public TreeNode(int num) {
        this.num = num;
    }

    //前序遍历，根左右 递归
    void preOrder() {
        System.out.println("root - " + this);

        while (this.left != null) {
            this.left.preOrder();
        }

        while (this.right != null) {
            this.right.preOrder();
        }

    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "num=" + num +
                '}';
    }
}

@Data
//@Slf4j
@AllArgsConstructor
@NoArgsConstructor
class BinaryTree {

    TreeNode root;

    public void preOrder() {
        if (root == null) {
            System.out.println("头节点为空，二叉树死了┭┮﹏┭┮");
        }else {
            root.preOrder();
        }

    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
