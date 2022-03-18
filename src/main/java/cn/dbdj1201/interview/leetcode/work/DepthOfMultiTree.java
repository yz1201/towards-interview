package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/3/18 9:52
 */
@Slf4j
public class DepthOfMultiTree {

    public static void main(String[] args) {

    }

    public static int maxDepth(Node root) {
        if (root == null)
            return 0;

//        root.children.stream().map(DepthOfMultiTree::maxDepth).collect(Collectors.toList());
//        return maxDepth(root.children) + 1;
        return -1;
    }


    public static int maxDepthCopy(Node root) {
        if (root == null) {
            return 0;
        }
        int maxChildDepth = 0;
        List<Node> children = root.children;
        for (Node child : children) {
            int childDepth = maxDepthCopy(child);
            maxChildDepth = Math.max(maxChildDepth, childDepth);
        }
        return maxChildDepth + 1;
    }


    public int maxDepthCopy1(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node node = queue.poll();
                List<Node> children = node.children;
                for (Node child : children) {
                    queue.offer(child);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }



}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};