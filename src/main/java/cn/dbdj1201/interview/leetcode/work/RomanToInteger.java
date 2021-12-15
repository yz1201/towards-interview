package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2021/12/15 9:53
 */
@Slf4j
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romaToInt("MCMXCIV"));
    }

    public static int romaToInt(String origin) {
        Map<Character, Integer> decodeMap = new HashMap<>(8);
        char[] cs = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        decodeMap.put('I', 1);
        decodeMap.put('V', 5);
        decodeMap.put('X', 10);
        decodeMap.put('L', 50);
        decodeMap.put('C', 100);
        decodeMap.put('D', 500);
        decodeMap.put('M', 1000);
        int target = 0;
        char[] targetArr = origin.toCharArray();
        for (int i = 0; i < targetArr.length; i++) {
            if (cs[0] == targetArr[i] && i < targetArr.length - 1) {
                if (targetArr[i + 1] == 'V') {
                    target += 4;
                    i++;
                } else if (targetArr[i + 1] == 'X') {


                    target += 9;
                    i++;
                } else {
                    target += decodeMap.get(targetArr[i]);
                }
            } else if (cs[2] == targetArr[i] && i < targetArr.length - 1) {
                if (targetArr[i + 1] == 'L') {
                    target += 40;
                    i++;
                } else if (targetArr[i + 1] == 'C') {
                    target += 90;
                    i++;
                } else {
                    target += decodeMap.get(targetArr[i]);
                }
            } else if (cs[4] == targetArr[i] && i < targetArr.length - 1) {
                if (targetArr[i + 1] == 'D') {
                    target += 400;
                    i++;
                } else if (targetArr[i + 1] == 'M') {
                    target += 900;
                    i++;
                } else {
                    target += decodeMap.get(targetArr[i]);
                }
            } else {
                target += decodeMap.get(targetArr[i]);
            }
        }
        log.info("origin is {}, target is {}", origin, target);
        return target;
    }
}
