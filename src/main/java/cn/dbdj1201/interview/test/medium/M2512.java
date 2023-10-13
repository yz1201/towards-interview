package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/10/12 11:00
 */
@Slf4j
public class M2512 {

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback,
                                     String[] report, int[] student_id, int k) {
        Map<Integer, Integer> scores = new HashMap<>();
        int len = report.length;
        for (int i = 0; i < len; i++) {
            scores.put(student_id[i], evaluateScore(report[i], positive_feedback, negative_feedback));
        }
        /*
            1 3
            2 1
            3 2
         */
        //  sortedByVal(scores);
        int size = scores.values().size();
        List<Integer> arrayList = new ArrayList<>(size);
        List<Integer> scoresArr = scores.values().stream().mapToInt(Integer::intValue).boxed().collect(Collectors.toList());
        for (Map.Entry<Integer, Integer> integerIntegerEntry : scores.entrySet()) {
            int max = scoresArr.stream().mapToInt(Integer::intValue).max().getAsInt();
            if (integerIntegerEntry.getValue() == max) arrayList.add(integerIntegerEntry.getKey());

            Iterator<Integer> iterator = scoresArr.iterator();
            scoresArr = scoresArr.stream().filter(num -> num != max).collect(Collectors.toList());
        }
        return arrayList.subList(0, Math.min(arrayList.size(), k));
    }

    private int evaluateScore(String record, String[] positiveFeedback, String[] negativeFeedback) {
        String[] words = record.split(" ");
        int score = 0;
        for (String word : words) {
            if (Arrays.stream(positiveFeedback).collect(Collectors.toList()).contains(word)) {
                score += 3;
            }

            if (Arrays.stream(negativeFeedback).collect(Collectors.toList()).contains(word)) {
                score--;
            }
        }
        return score;
    }

}
