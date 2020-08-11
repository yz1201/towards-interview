package cn.dbdj1201.interview;

import lombok.Data;

import java.util.Stack;

/**
 * @author yz1201
 * @date 2020-08-11 22:35
 **/
public class Prob7 {

    public static void main(String[] args) throws Exception {
        /*
        面试题 7：用两个栈实现队列
        题目描述：用两个栈实现一个队列，实现对了的两个函数 appendTail 和
    deleteHead，分别完成在队列尾插入结点和在队列头部删除结点的功能。
        */
        test();
    }

    private static void test() throws Exception {
        IQueue<Integer> queue = new IQueue<>();
        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        queue.appendTail(4);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
//        System.out.println(queue.deleteHead());
    }

}

@Data
class IQueue<T> {

    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    void appendTail(T t) {
        stack1.push(t);
    }

    public T deleteHead() throws Exception {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.empty()) {
            throw new Exception("出问题了");
        }
        return stack2.pop();
    }

}
