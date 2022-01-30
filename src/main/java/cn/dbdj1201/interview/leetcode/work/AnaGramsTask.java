package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/1/30 21:06
 */
@Slf4j
public class AnaGramsTask {

    public static void main(String[] args) {
//        String test1 ="ac";
//        String test2 ="bb";
//        System.out.println(calStrValue(test1));
//        System.out.println(calStrValue(test2));

        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagramsCopy(strArr));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> target= new ArrayList<>();

        Map<Integer,List<String>> targetMap = new HashMap<>();



        for (String str : strs) {
            List<String> innerList = new ArrayList<>();
            innerList.add(str);
            int value = calStrValue(str);
//            targetMap.put(value,)


        }

        return null;
    }

    private static int calStrValue(String str) {
        int value = 0;
        for (char c : str.toCharArray()) {
            value += c;
        }
        return value;
    }


    public static List<List<String>> groupAnagramsCopy(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

}
