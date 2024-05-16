package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: yz1201
 * @Date: 2024/5/16 15:53
 */
@Slf4j
public class S2706 {

    public static int buyChoco(int[] prices, int money) {
        // 1 2 3  1 5 2 1 |  2
        int min = money;
        Arrays.sort(prices);
        if (prices[0] >= money) return min;
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            for (int i1 = i + 1; i1 < len; i1++) {
                min = money - prices[i] - prices[i1];
                if (min >= 0) return min;
                else min = money;
            }
        }
        return min;
    }

    public int buyChocoCopy(int[] prices, int money) {
        int fi = Integer.MAX_VALUE, se = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < fi) {
                se = fi;
                fi = price;
            } else if (price < se) {
                se = price;
            }
        }
        return money < fi + se ? money : money - fi - se;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,2};
        System.out.println(buyChoco(nums, 3));
    }

}
