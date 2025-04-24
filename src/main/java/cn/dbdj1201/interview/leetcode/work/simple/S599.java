package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2024/7/11 10:04
 */
@Slf4j
public class S599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> sentenceArr = new ArrayList<>();
        Map<String, Integer> counter = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            int finalI = i;
            if (Arrays.stream(list2).anyMatch(restaurant -> restaurant.equals(list1[finalI]))) {
                for (int i1 = 0; i1 < list2.length; i1++) {
                    if (list1[i].equals(list2[i1]) && minIndex >= i + i1) {
                        minIndex = i + i1;
                        counter.put(list1[i], minIndex);
//                        sentenceArr.add(list1[i]);

                    }
                }
            }
        }
        Integer integer = counter.values().stream().min(Comparator.comparingInt(Integer::intValue)).get();
        for (Map.Entry<String, Integer> stringIntegerEntry : counter.entrySet()) {
            if (Objects.equals(stringIntegerEntry.getValue(), integer)) {
                sentenceArr.add(stringIntegerEntry.getKey());
            }
        }
        String[] restautrants = new String[sentenceArr.size()];
        for (int i = 0; i < sentenceArr.size(); i++) {
            restautrants[i] = sentenceArr.get(i);
        }
        return restautrants;
    }

    public String[] findRestaurantV1(String[] list1, String[] list2) {
        List<String> sentenceArr = new ArrayList<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            int finalI = i;
            if (Arrays.stream(list2).anyMatch(restaurant -> restaurant.equals(list1[finalI]))) {
                for (int i1 = 0; i1 < list2.length; i1++) {
                    if (list1[i].equals(list2[i1])) {
                        if (minIndex > i + i1) {
                            minIndex = i + i1;
                            sentenceArr.clear();
                            sentenceArr.add(list1[i]);
                        } else if (minIndex == i + i1) {
                            sentenceArr.add(list1[i]);
                        }
                    }
                }
            }
        }
        String[] restautrants = new String[sentenceArr.size()];
        for (int i = 0; i < sentenceArr.size(); i++) {
            restautrants[i] = sentenceArr.get(i);
        }
        return restautrants;
    }

    public String[] findRestaurantCp(String[] list1, String[] list2) {
        int n1 = list1.length, n2 = list2.length;
        Map<String, Integer> map = new HashMap<>((int) (n1 / 0.75f));
        for (int i = 0; i < n1; ++i) {
            map.put(list1[i], i);
        }
        int cnt = 0, x = Integer.MAX_VALUE;
        // list1可以被重用
        for (int i = 0; i < n2 && i <= x; ++i) {
            String s = list2[i];
            if (map.containsKey(s)) {
                int t = map.get(s) + i;
                if (t <= x) {
                    if (t < x) {
                        x = t;
                        cnt = 0;
                    }
                    list1[cnt++] = list2[i];
                }
            }
        }
        return Arrays.copyOf(list1, cnt);
    }

    private static String test01(String[] arr){
        return "hello";
    }

    private static String test01(Object obj){
        return "hi";
    }

    public static void main(String[] args) {
        Test0715 test0715 = new Test0715();
        System.out.println(test01(test0715.getParam("ada")));
    }
}

class Test0715{
    public  <T> T getParam(String key){
        Object obj = "test";
        return (T) obj;
    }
}