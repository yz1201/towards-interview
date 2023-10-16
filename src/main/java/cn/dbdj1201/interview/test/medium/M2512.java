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
            //取最大值
            int max = scoresArr.stream().mapToInt(Integer::intValue).max().getAsInt();
            //最大值优先
            if (integerIntegerEntry.getValue() == max){
                arrayList.add(integerIntegerEntry.getKey());
                Iterator<Integer> iterator = scoresArr.iterator();
                while (iterator.hasNext()){
                    int next = iterator.next();
                    if (next == max){
                        iterator.remove();
                        break;
                    }
                }
            }
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
    public List<Integer> topStudentsV1(String[] positive_feedback, String[] negative_feedback,
                                     String[] report, int[] student_id, int k) {
        Map<Integer, Integer> scores = new HashMap<>();
        int len = report.length;
        Integer[] nums = new Integer[len];
        for (int i = 0; i < len; i++) {
            int score = evaluateScore(report[i], positive_feedback, negative_feedback);
            scores.put(student_id[i], score);
            nums[i] = score;
        }
        Arrays.sort(nums, Collections.reverseOrder());
        List<Integer> arrayList = new ArrayList<>(len);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : scores.entrySet()) {
            for (int num : nums) {
                if (integerIntegerEntry.getValue() == num) arrayList.add(integerIntegerEntry.getKey());
            }
        }
        return arrayList.subList(0, Math.min(arrayList.size(), k));
    }

}
