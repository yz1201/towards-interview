package cn.dbdj1201.interview.test;

import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.lang.Double.parseDouble;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingDouble;

/**
 * @Author: yz1201
 * @Date: 2024/12/24 15:37
 */
@Slf4j
public class TestMain20241214 {

    static List<String> names = List.of("AAA", "BBB", "CCC", "DDD", "EEE");

    public static void main(String[] args) throws FileNotFoundException {
//        int len = 10000;
//        for (int i = 0; i < len; i++) {
//            String sb = names.get(RandomUtil.randomInt(0, names.size())) +
//                    ";" +
//                    RandomUtil.randomDouble(0, 10);
//            System.out.println(sb);
//        }

  log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        var allStats = new BufferedReader(new FileReader("E:\\develop\\code_repo\\towards-interview\\src\\main\\resources\\measurements.txt"))
                .lines()
                .parallel()
                .collect(
                        groupingBy(line -> line.substring(0, line.indexOf(';')),
                                summarizingDouble(line ->
                                        parseDouble(line.substring(line.indexOf(';') + 1)))));
        var result = allStats.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                e -> {
                    var stats = e.getValue();
                    return String.format("%.1f/%.1f/%.1f",
                            stats.getMin(), stats.getAverage(), stats.getMax());
                },
                (l, r) -> r,
                TreeMap::new));
        System.out.println(result);
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>");

    }

    void testDataBuild() {


    }
}
