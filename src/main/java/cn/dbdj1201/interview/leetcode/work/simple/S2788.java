package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2024/1/24 9:55
 */
@Slf4j
public class S2788 {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            String regex = Pattern.quote(String.valueOf(separator));
            System.out.println(regex);
            String[] split = word.split(regex);
            res.addAll(Arrays.asList(split));
        }
        return res;
    }

    public List<String> splitWordsBySeparatorV1(List<String> words, char separator) {
        List<String> res = new ArrayList<String>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                if (c == separator) {
                    if (sb.length() > 0) {
                        res.add(sb.toString());
                        sb.setLength(0);
                    }
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                res.add(sb.toString());
            }
        }
        return res;
    }


    public List<String> splitWordsBySeparatorV2(List<String> words, char separator) {
        return words.stream()
                .flatMap(word -> Arrays.stream(word.split(Pattern.quote(String.valueOf(separator)))))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
    }

}
