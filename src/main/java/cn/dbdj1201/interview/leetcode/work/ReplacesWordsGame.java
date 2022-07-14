package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/7/7 14:25
 */
@Slf4j
public class ReplacesWordsGame {

    public static void main(String[] args) {
        List<String> dictionary = List.of("cat", "rat", "bat");
        List<String> dictionary2 = List.of("catt", "cat", "bat", "rat");
        List<String> dictionary1 = List.of("a", "b", "c");
        System.out.println(replaceWords(dictionary, "the cattle was rattled by the battery"));
        System.out.println(replaceWordsCopyV1(dictionary2, "the cattle was rattled by the battery"));
        System.out.println(replaceWords(dictionary1, "aadsfasf absbs bbab cadsfafs"));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");

        List<String> collect = Arrays.stream(words).map(word -> {
            Set<String> replaceWord = new TreeSet<>();
            for (String root : dictionary) {
                if (word.startsWith(root)) {
                    replaceWord.add(root);
                }
            }
            if (replaceWord.isEmpty())
                return word;
            else
                return replaceWord.iterator().next();
        }).collect(Collectors.toList());
        StringBuilder ans = new StringBuilder();
        for (String s : collect) {
            ans.append(s).append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }

    public static String replaceWordsCopyV1(List<String> dictionary, String sentence) {
        Set<String> dictionarySet = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (dictionarySet.contains(word.substring(0, 1 + j))) {
                    words[i] = word.substring(0, 1 + j);
                    break;
                }
            }
        }
        return String.join(" ", words);
    }

}
