package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/12/21 14:21
 */
@Slf4j
public class S2866 {

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int max = maxHeights.stream().mapToInt(Integer::intValue).max().getAsInt();

        int index = 0;

        for (int i = 0; i < maxHeights.size(); i++) {
            if (maxHeights.get(i) == max) {
                index = i;
                break;
            }
        }

        int left = index - 1, right = index;
        while (left >= 0) {


        }

        while (right < maxHeights.size()) {


        }

        return 0;
    }

    public long maximumSumOfHeightsCp(List<Integer> maxHeights) {
        int n = maxHeights.size();
        long res = 0;
        long[] prefix = new long[n];
        long[] suffix = new long[n];
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        Deque<Integer> stack2 = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            // ?
            while (!stack1.isEmpty() && maxHeights.get(i) < maxHeights.get(stack1.peek())) {
                stack1.pop();
            }
            if (stack1.isEmpty()) {
                prefix[i] = (long) (i + 1) * maxHeights.get(i);
            } else {
                prefix[i] = prefix[stack1.peek()] + (long) (i - stack1.peek()) * maxHeights.get(i);
            }
            stack1.push(i);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && maxHeights.get(i) < maxHeights.get(stack2.peek())) {
                stack2.pop();
            }
            if (stack2.isEmpty()) {
                suffix[i] = (long) (n - i) * maxHeights.get(i);
            } else {
                suffix[i] = suffix[stack2.peek()] + (long) (stack2.peek() - i) * maxHeights.get(i);
            }
            stack2.push(i);
            res = Math.max(res, prefix[i] + suffix[i] - maxHeights.get(i));
        }
        return res;
    }

}
