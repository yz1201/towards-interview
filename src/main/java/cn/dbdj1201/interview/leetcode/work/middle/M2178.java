package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/7/6 9:28
 */
@Slf4j
public class M2178 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 != 0) return res;
        long start = 2;
        long index = start;
        long tempSum = finalSum;
        while (tempSum != 0) {
            tempSum -= index;
            if (tempSum < 0) {
                start += 2;
                res = cal(start, finalSum);
            }
            res.add(index);
            index += 2;
        }
        return res;
    }

    private List<Long> cal(long start, long finalSum) {
        List<Long> res = new ArrayList<>();
        long index = start;
        long tempSum = finalSum;
        while (tempSum != 0) {
            tempSum -= index;
            if (tempSum < 0) {
                start += 2;
                res = cal(start, finalSum);
            }
            res.add(index);
            index += 2;
        }
        return res;
    }

    public List<Long> maximumEvenSplitCopy(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 > 0) {
            return res;
        }
        for (long i = 2; i <= finalSum; i += 2) {
            res.add(i);
            finalSum -= i;
        }
        res.set(res.size() - 1, res.get(res.size() - 1) + finalSum);
        return res;
    }

}
