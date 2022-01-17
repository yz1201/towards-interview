package cn.dbdj1201.interview.leetcode.work;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @Author: yz1201
 * @Date: 2022/1/17 15:46
 */
public class MyStack {

    private Deque<Integer> deque;

    public MyStack() {
        this.deque = new LinkedList<>();
    }

    public void push(int x) {
        this.deque.push(x);
    }

    public int pop() {
        return this.deque.pop();
    }

    public int top() {
        return Objects.requireNonNullElse(this.deque.peek(), -1);
    }

    public boolean empty() {
        return this.deque.isEmpty();
    }
}
