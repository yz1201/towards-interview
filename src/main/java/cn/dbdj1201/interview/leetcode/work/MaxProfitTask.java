package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @Author: yz1201
 * @Date: 2021/12/29 16:40
 */
@Slf4j
public class MaxProfitTask {

    public static void main(String[] args) {
        //[7,1,5,3,6,4]
//        int[] prices = {1, 3, 5, 1, 2, 3, 8};
        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {4, 1, 2, 3,4,5, 1};
        System.out.println(maxProfit1(prices));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int targetIndex;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int max, maxProfit = 0;
            for (int j = i + 1; j < len; j++) {
                if (prices[j] - prices[i] > 0) {
                    max = Math.max(maxProfit, prices[j] - prices[i]);
                    if (max > maxProfit) {
                        targetIndex = j - i;
                        maxProfit = max;
                        map.put(maxProfit, targetIndex);
                    } else {
                        break;
                    }
                } else {
                    i = j - 1;
                    break;
                }
            }
        }

        Optional<Integer> max = map.keySet().stream().max(Comparator.comparingInt(n -> n));
        int key;
        if (max.isEmpty()) {
            return 0;
        } else {
            key = max.get();
        }
        log.info("maxProfit : {}", key);
        return map.get(key) + 1;
    }

    public static int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int targetIndex;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int max, maxProfit = 0;
            for (int j = i + 1; j < len; j++) {
                if (prices[j] - prices[i] > 0) {
                    max = Math.max(maxProfit, prices[j] - prices[i]);
                    if (max > maxProfit) {
                        targetIndex = j - i;
                        maxProfit = max;
                        map.put(maxProfit, targetIndex);
                    }
                }
            }
        }
        System.out.println(map);
        int maxKey = 0;
        for (Integer integer : map.keySet()) {
            maxKey = Math.max(maxKey, integer);
        }
        log.info("maxProfit : {}", maxKey);
        return maxKey;
//        return map.get(maxKey) + 1;
    }

    public static int maxProfitCopy1(int[] prices){
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }
}
