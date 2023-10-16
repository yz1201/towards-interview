package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/10/13 15:27
 */
@Slf4j
public class T2512 {

    public static void main(String[] args) {
        M2512 m2512 = new M2512();
        String[] positive_feedback = {"smart","brilliant","studious"};
        String[] negative_feedback = {"not"};
        String[] report = {"this student is not studious","the student is smart"};
        int[] id = {1,2};
        System.out.println(m2512.topStudents(positive_feedback, negative_feedback, report, id, 2));

        Arrays.sort(id);

        System.out.println(Arrays.toString(id));
    }
}
