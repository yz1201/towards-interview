package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: yz1201
 * @Date: 2022/4/20 16:23
 */
@Slf4j
public class CountElementsTask {
    public static void main(String[] args) {
//        int[] arr = {1, 2,2, 3, 4};
        int[] arr = {1, 1, 2};
        countElements(arr);
    }

    public static int countElements(int[] arr) {
        AtomicInteger ans = new AtomicInteger();
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            counter.put(arr[i], counter.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(counter);
//        counter.forEach((key, value) -> ans.set(counter.get(key + 1) == counter.get(key) ?
//                counter.get(key) :
//                Math.min(counter.get(key + 1), counter.get(key))));

        counter.forEach((key, value) -> {
            Integer target = counter.get(key + 1);
//            ans.set(ans.addAndGet(Objects.equals(target, counter.get(key)) ?
//                    counter.get(key) :
//                    Math.min(target == null ? 0 : target, counter.get(key))));
            if (counter.containsKey(key + 1)) {
                ans.set(ans.addAndGet(counter.get(key)));
            }
        });

        System.out.println(ans);

        return -1;
    }
}
