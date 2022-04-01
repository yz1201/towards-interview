package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/4/1 15:18
 */
@Slf4j
public class JudgeReorderDoubled {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};
        int[] arr1 = {3, 1, 3, 6};
        int[] arr2 = {2, 1, 2, 6};
        int[] arr3 = {4, -2, 2, -4};
        int[] arr4 = {1, 2, 4, 16, 8, 4};

        System.out.println(canReorderDoubled(arr1));
        System.out.println(canReorderDoubled(arr2));
        System.out.println(canReorderDoubled(arr3));
        System.out.println(canReorderDoubled(arr4));
    }

    public static boolean canReorderDoubled(int[] arr) {
        if (arr.length % 2 != 0)
            return false;

        List<Integer> positives = Arrays.stream(arr).boxed().filter(num -> num >= 0)
                .sorted(Comparator.comparingInt(n -> n)).collect(Collectors.toList());

        List<Integer> negatives = Arrays.stream(arr).boxed().filter(num -> num < 0)
                .sorted(Comparator.comparingInt(n -> n)).collect(Collectors.toList());

        Set<Integer> indexs = new HashSet<>();

        if (positives.size() % 2 != 0)
            return false;
        if (negatives.size() % 2 != 0)
            return false;

        for (int i = 0; i < positives.size() / 2; i++) {
            if (!positives.contains(positives.get(i) * 2))
                return false;
            else {
                int target = positives.indexOf(positives.get(i) * 2);
                for (int i1 = i + 1; i1 < positives.size(); i1++) {
                    if (positives.get(i1) == target) {
                        if (!indexs.add(i1)) {
                            int index = i1 + 1;
                            while (index < positives.size()) {
                                if (!indexs.add(index))
                                    index++;
                                else {
                                    break;
                                }
                            }
                            if (index == negatives.size())
                                return false;
                        }
                    }
                }

            }
        }

        for (int i = negatives.size() - 1; i >= negatives.size() / 2; i--) {
            if (!negatives.contains(negatives.get(i) * 2))
                return false;
            else{

                int target = negatives.indexOf(negatives.get(i) * 2);
                for (int i1 = i + 1; i1 < negatives.size(); i1++) {
                    if (negatives.get(i1) == target) {
                        boolean result = indexs.add(i1);
                        if (!result) {
                            int index = i1 + 1;
                            while (index < negatives.size()) {
                                if (!indexs.add(index))
                                    index++;
                                else {
                                    break;
                                }
                            }
                            if (index == negatives.size())
                                return false;
                        }
                    }
                }

            }
        }

//        if (indexs.size() == arr.length)

        return true;
    }
}
