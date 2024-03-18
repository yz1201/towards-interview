package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @Author: yz1201
 * @Date: 2024/3/5 11:02
 */
@Slf4j
public class S232 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public S232() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

    public static void main(String[] args) {
        String test1 = "2";
        String test2 = "12";
        String test3 = "22";
        String test4 = "28";
        String test5 = "8";
        String test6 = "18";
        String content = "8,28";

        System.out.println("8,28".contains(test1));
        System.out.println("8,28".contains(test2));
        System.out.println("8,28".contains(test3));
        System.out.println("8,28".contains(test4));
        System.out.println("8,28".contains(test5));
        System.out.println("8,28".contains(test6));

    }
}
