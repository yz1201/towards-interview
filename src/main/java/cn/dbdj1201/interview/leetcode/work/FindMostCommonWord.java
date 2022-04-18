package cn.dbdj1201.interview.leetcode.work;

import cn.hutool.extra.tokenizer.Word;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/4/18 14:27
 */
@Slf4j
public class FindMostCommonWord {

    public static void main(String[] args) {
        String test = "test..,,,..tes.!t.a.!?;'";
        System.out.println(test.replaceAll("\\.", ""));

//        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
//        String paragraph = "a.!?;'";
        String paragraph = "a, a, a, a, b,b,b,c, c";
//        String[] banned = {"hit"};
        String[] banned = {"a"};

        System.out.println(mostCommonWordCopy(paragraph, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split(" ");
        // !?',;.
        List<String> collect = Arrays.stream(words)
                .map(word -> word.replaceAll("\\,", ""))
                .map(word -> word.replaceAll("\\!*", ""))
                .map(word -> word.replaceAll("\\'*", ""))
                .map(word -> word.replaceAll("\\?*", ""))
                .map(word -> word.replaceAll("\\;*", ""))
                .map(word -> word.replaceAll("\\.*", ""))
                .map(String::toLowerCase).collect(Collectors.toList());

        System.out.println(collect);
        List<String> bannedList = Arrays.stream(banned).collect(Collectors.toList());
        Map<String,Integer> counter = new HashMap<>();
        collect.forEach(word->{
            if (!bannedList.contains(word)){
                counter.put(word,counter.getOrDefault(word,0)+1);
            }
        });

        List<Map.Entry<String, Integer>> entries = counter.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());
//        System.out.println(entries);

        return entries.get(entries.size()-1).getKey();
    }

    public static String mostCommonWordCopy(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }
        int maxFrequency = 0;
        Map<String, Integer> frequencies = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int length = paragraph.length();
        for (int i = 0; i <= length; i++) {
            if (i < length && Character.isLetter(paragraph.charAt(i))) {
                sb.append(Character.toLowerCase(paragraph.charAt(i)));
            } else if (sb.length() > 0) {
                String word = sb.toString();
                if (!bannedSet.contains(word)) {
                    int frequency = frequencies.getOrDefault(word, 0) + 1;
                    frequencies.put(word, frequency);
                    maxFrequency = Math.max(maxFrequency, frequency);
                }
                sb.setLength(0);
            }
        }
        String mostCommon = "";
        Set<Map.Entry<String, Integer>> entries = frequencies.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            if (frequency == maxFrequency) {
                mostCommon = word;
                break;
            }
        }
        return mostCommon;
    }
}
