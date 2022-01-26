package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/1/25 14:45
 */
@Slf4j
public class LongestWordsOfDicTask {
    public static void main(String[] args) {
        String[] words = {"t", "te", "test", "tes"};
        longestWord(words);
    }

    /**
     * {"test1","t1","t"}
     *
     * @param words
     * @return
     */
    public static String longestWord(String[] words) {
        List<String> collect = Arrays.stream(words).sorted((s1, s2) -> Integer.compare(s1.length() - s2.length(), 0))
                .collect(Collectors.toList());

        List<Integer> indexList = Arrays.stream(words).sorted((s1, s2) -> Integer.compare(s1.length() - s2.length(), 0))
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect);

        int index = 1;
        int size = indexList.size();

        while (index < size) {

            if (indexList.get(index).compareTo(indexList.get(index - 1)) != 0) {
                index++;
            }

        }
        return "";
    }

    public static String longestWordCopy1(String[] words) {
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(words));
        Arrays.sort(words, (a, b) -> a.length() == b.length()
                ? a.compareTo(b) : b.length() - a.length());
        for (String word: words) {
            boolean good = true;
            for (int k = 1; k < word.length(); ++k) {
                if (!wordSet.contains(word.substring(0, k))) {
                    good = false;
                    break;
                }
            }
            if (good) return word;
        }
        return "";
    }

}
