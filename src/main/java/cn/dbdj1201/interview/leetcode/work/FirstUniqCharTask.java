package cn.dbdj1201.interview.leetcode.work;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/1/18 20:24
 */
public class FirstUniqCharTask {

    public static void main(String[] args) {
        String testStr = "tseesta";

        System.out.println(firstUniqChar4(testStr));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        List<Character> cs = new ArrayList<>();
        int length = s.length();

        if (length <= 1) return 0;

        for (int i = 0; i < length; i++) {
            chars.put(s.charAt(i), i);
            cs.add(s.charAt(i));
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        int len = s.length();
        if (len < 2) return 0;
        List<Integer> minIndexs = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            boolean checkFlag = true;
            char temp = s.charAt(i);
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(j) == temp) {
                    checkFlag = false;
                    break;
                }
            }
            if ((i + 1) < len && checkFlag) {
                minIndexs.add(i);
            }
        }
        System.out.println(minIndexs);

        return minIndexs.size() > 0 ? minIndexs.get(0) : -1;

    }

    public static int firstUniqChar2(String s) {
        int len = s.length();
        if (len == 1) return 0;
        Set<Character> set = new HashSet<>(len);

        for (int i = 0; i < len; i++) {
            boolean addResult = set.add(s.charAt(i));
        }

        if (set.size() == 1) return -1;

        return -5;

    }


    public static int firstUniqChar3(String s) {

        Deque<Map<Character, Integer>> deque = new LinkedList<>();
        int len = s.length();
        Map<Character, Integer> cs = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!cs.containsKey(s.charAt(i))) {
                cs.put(s.charAt(i), i);
                deque.addFirst(cs);
            }
        }
        return -1;

    }

    public static int firstUniqChar4(String s) {
        int len = s.length();
        Map<Character, Integer> charsMap = new HashMap<>(len);

        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if (j != i) {
                    if (s.charAt(i) == s.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                charsMap.put(s.charAt(i), i);
            }

        }
        if (charsMap.size() < 1) return -1;
        else return charsMap.values().stream().mapToInt(Integer::intValue).min().getAsInt();
    }
}
