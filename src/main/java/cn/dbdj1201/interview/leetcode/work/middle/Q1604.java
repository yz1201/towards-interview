package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2023/2/7 14:03
 */
@Slf4j
public class Q1604 {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> nameList = new ArrayList<>();
        int time = 0;
        int fixedLen = 3;
        int right = 0;
        int[] validLen = new int[10];
        int m = 0;
        for (int i = 0; i < keyName.length - 1; i++) {
            String keyR = keyName[right];
            if (keyName[i + 1].equals(keyName[i])) validLen[m]++;
            else m++;
        }
        return null;
    }


    public List<String> alertNamesCopy(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> timeMap = new HashMap<>();
        int n = keyName.length;
        for (int i = 0; i < n; i++) {
            String name = keyName[i];
            String time = keyTime[i];
            timeMap.putIfAbsent(name, new ArrayList<>());
            int hour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
            int minute = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
            timeMap.get(name).add(hour * 60 + minute);
        }
        List<String> res = new ArrayList<>();
        Set<String> keySet = timeMap.keySet();
        for (String name : keySet) {
            List<Integer> list = timeMap.get(name);
            Collections.sort(list);
            int size = list.size();
            for (int i = 2; i < size; i++) {
                int time1 = list.get(i - 2), time2 = list.get(i);
                int difference = time2 - time1;
                if (difference <= 60) {
                    res.add(name);
                    break;
                }
            }
        }
        Collections.sort(res);
        return res;
    }


}
