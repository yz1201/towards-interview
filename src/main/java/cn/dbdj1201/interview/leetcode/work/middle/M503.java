package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: yz1201
 * @Date: 2023/12/27 10:51
 */
@Slf4j
public class M503 {

    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        Arrays.fill(res, -1);
        Deque<Integer> monotoneStack = new ArrayDeque<>();
        for (int i = 0; i < 2 * length - 1; i++) {
            while (!monotoneStack.isEmpty() && nums[monotoneStack.peek()] < nums[i % length]) {
                res[monotoneStack.pop()] = nums[i % length];
            }
            monotoneStack.push(i % length);
        }
        return res;
    }

    public int[] nextGreaterElementsCp(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ret;
    }
}
/*
[1,8,-1,-100,-1,222,1111111,-111111]
注意，出栈的同时，res[stack.pop(-1)] = nums[i]

i                          栈                              res
0                         []                       [-1,-1,-1,-1,-1,-1,-1,-1]
1                        [0]                      [-1,-1,-1,-1,-1,-1,-1,-1]                  0出栈，1入栈
2                        [1]                      [8,-1,-1,-1,-1,-1,-1,-1]                   2入栈
3                       [1,2,3]                   [8,-1,-1,-1,-1,-1,-1,-1]                 3入栈
4                        [1,2,4]                     [8,-1,-1,-1,-1,-1,-1,-1]                   3出栈，4入栈
5                          [5]                       [8,-1,-1,-1,-1,-1,-1,-1]          1,2,4出栈，5入栈
6                         [6]                     [8,222,222,-1,222,-1,-1,-1]             5出栈，6入栈
7                    [6，7]                        [8,222,222,-1,222,1111111,-1,-1]             7入栈
8->0                   [6]                      [8,222,222,-1,222,1111111,-1,-1]                 7出栈
9->1                  [6]                         [8,222,222,-1,222,1111111,-1,1]                无变化
10->2                  [6]                         [8,222,222,-1,222,1111111,-1,1]                无变化
11->3                 [6]                         [8,222,222,-1,222,1111111,-1,1]                无变化
12->4                 [6]                         [8,222,222,-1,222,1111111,-1,1]                无变化
13->5                [6]                         [8,222,222,-1,222,1111111,-1,1]                无变化

 */
