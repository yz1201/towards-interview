package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/6/21 14:17
 */
@Slf4j
public class S728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        int index = left;
        while (index <= right) {
            if (index < 10) {
                nums.add(index);
                index++;
                continue;
            }
            if (checkSelfDivide(index)) nums.add(index);
            index++;
        }
        return nums;
    }

    private boolean checkSelfDivide(int index) {
        int num = index;
        while (num != 0) {
            int n = num % 10;
            if (n == 0 || index % n != 0) return false;
            num /= 10;
        }
        return true;
    }
}
