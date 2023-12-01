package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/11/28 14:20
 */
@Slf4j
public class S2437 {

    public int countTime(String time) {
        //??:??
        char[] cs = time.toCharArray();
        int a = 1, b = 1, c = 1, d = 1;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '?') {

            }
        }
        return a * b * c * d;
    }

    public int countTimeV1(String time) {
        String[] timeArr = time.split(":");
        int a = 1, b = 1, c = 1, d = 1;
        String hour = timeArr[0];
        if (hour.charAt(0) == '?' && hour.charAt(1) == '?') {
            a = 4;
            b = 6;
        } else if (hour.charAt(0) == '?' && hour.charAt(1) != '?') {
            if (hour.charAt(1) - '0' > 3) {
                a = 2;
            } else {
                a = 3;
            }
        } else if (hour.charAt(1) == '?' && hour.charAt(0) != '?') {
            if (hour.charAt(0) - '0' <= 1) {
                b = 10;
            } else if (hour.charAt(0) == '2'){
                b = 4;
            }
        }
        String minute = timeArr[1];
        if (minute.charAt(0) == '?' && minute.charAt(1) == '?') {
            c = 6;
            d = 10;
        } else if (minute.charAt(0) == '?' && minute.charAt(1) != '?') {
            c = 6;
        } else if (minute.charAt(1) == '?' && minute.charAt(0) != '?') {
            d = 10;
        }
        return a * b * c * d;
    }


    int res = 0;

    public int countTimeCopy(String time) {
        char[] arr = time.toCharArray();
        dfs(arr, 0);
        return res;
    }

    public void dfs(char[] arr, int pos) {
        if (pos == arr.length) {
            if (check(arr)) {
                res++;
            }
            return;
        }
        if (arr[pos] == '?') {
            for (int i = 0; i <= 9; i++) {
                arr[pos] = (char) ('0' + i);
                dfs(arr, pos + 1);
                arr[pos] = '?';
            }
        } else {
            dfs(arr, pos + 1);
        }
    }

    public boolean check(char[] arr) {
        int hh = (arr[0] - '0') * 10 + arr[1] - '0';
        int mm = (arr[3] - '0') * 10 + arr[4] - '0';
        return hh < 24 && mm < 60;
    }



}
