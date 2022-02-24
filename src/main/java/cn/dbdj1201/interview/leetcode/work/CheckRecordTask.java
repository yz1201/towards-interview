package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/2/24 16:51
 */
@Slf4j
public class CheckRecordTask {

    public static void main(String[] args) {

        System.out.println(checkRecord("PPALLA"));
    }


    /*
        'A'：Absent，缺勤
        'L'：Late，迟到
        'P'：Present，到场
        按 总出勤 计，学生缺勤（'A'）严格 少于两天。
        学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
     */
    public static boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int lateCount = 0;
        for (char aChar : chars) {
            if (aChar == 'A')
                lateCount++;
        }
        if (lateCount >= 2)
            return false;

        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == 'L' && chars[i + 1] == 'L' && chars[i+2] == 'L') {
                return false;
            }
        }

        return true;
    }
}
