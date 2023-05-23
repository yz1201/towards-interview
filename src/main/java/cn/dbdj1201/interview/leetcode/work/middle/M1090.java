package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author: yz1201
 * @Date: 2023/5/23 15:23
 */
@Slf4j
public class M1090 {

    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {

        return -1;
    }

    public int largestValsFromLabelsV1(int[] values, int[] labels, int numWanted, int useLimit) {
        return IntStream.range(0, values.length)
                .mapToObj(i -> new int[]{values[i], labels[i]})
                .collect(Collectors.groupingBy(pair -> pair[1]))
                .values()
                .stream()
                .map(list -> list
                        .stream()
                        .map(pair -> pair[0])
                        .sorted(Comparator.reverseOrder())
                        .limit(useLimit)
                        .toArray(Integer[]::new)
                )
                .flatMap(Stream::of)
                .sorted(Comparator.reverseOrder())
                .limit(numWanted)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
