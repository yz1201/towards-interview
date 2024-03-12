package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2024/3/11 14:13
 */
@Slf4j
public class S2129 {

    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() <= 2) {
                sb.append(word.toLowerCase()).append(" ");
            } else {
                sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
