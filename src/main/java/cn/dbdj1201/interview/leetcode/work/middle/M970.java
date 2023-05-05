package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: yz1201
 * @Date: 2023/5/5 15:34
 */
@Slf4j
public class M970 {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> numsSet = new HashSet<>();
        int rateX = CalRate(x, bound);
        int rateY = CalRate(y, bound);

        for (int i = 0; i < rateX; i++) {
            double d = Math.pow(x, i);
            for (int i1 = 0; i1 < rateY; i1++) {
                int n = (int) (d + Math.pow(y, i1));
                if (n <= bound)
                    numsSet.add(n);
            }
        }

        for (int i = 0; i < rateY; i++) {
            double d = Math.pow(y, i);
            for (int i1 = 0; i1 < rateX; i1++) {
                int n = (int) (d + Math.pow(x, i1));
                if (n <= bound)
                    numsSet.add(n);
            }
        }
        return new ArrayList<>(numsSet);
    }

    private int CalRate(int num, int target) {
        int rate = 1;
        if (num == 1) return rate;
        while (target / num != 0) {
            rate++;
            target = target / num;
        }
        return rate;
    }
}
