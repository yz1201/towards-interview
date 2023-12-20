package cn.dbdj1201.interview.test.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/12/20 16:20
 */
@Slf4j
public class S2828 {
    public boolean isAcronym(List<String> words, String s) {
        int size = words.size();
        int len = s.length();
        if (size != len) return false;
        for (int i = 0; i < size; i++) {
            if (!words.get(i).startsWith("" + s.charAt(i))) return false;
        }
        return true;
    }

}
