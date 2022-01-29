package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/1/29 19:52
 */
@Slf4j
public class FindContestMatchTask {

    public static void main(String[] args) {
//        System.out.println(findContestMatch(8));
        System.out.println(findContestMatchCopy2(8));
        System.out.println(Integer.lowestOneBit(2));
    }

    /**
     * "(((1,8),(4,5)),((2,7),(3,6)))"
     *
     * @param n
     * @return
     */
    public static String findContestMatch(int n) {
        if (n <= 1 || n % 2 != 0) return "";
        String startStr = n == 2 ? "" : "(";
        String endStr = n == 2 ? "" : ")";
        StringBuilder ans = new StringBuilder(startStr);
        int left = 1, right = n;
        while (left < right) {
            ans.append("(").append(left++).append(",").append(right--).append(")");
            if (left < right) {
                ans.append(",");
            }
        }
        ans.append(endStr);
        return ans.toString();
    }

    public static String findContestMatchCopy(int n) {
        String[] team = new String[n];
        for (int i = 1; i <= n; ++i)
            team[i - 1] = "" + i;

        System.out.println(Arrays.toString(team));

        for (; n > 1; n /= 2)
            for (int i = 0; i < n / 2; ++i)
                team[i] = "(" + team[i] + "," + team[n - 1 - i] + ")";

        System.out.println(Arrays.toString(team));

        return team[0];
    }

    static int[] team;
    static int t;
    static StringBuilder ans;

    public static String findContestMatchCopy2(int n) {
        team = new int[n];
        t = 0;
        ans = new StringBuilder();
        write(n, Integer.numberOfTrailingZeros(n));
        return ans.toString();
    }

    public static void write(int n, int round) {
        if (round == 0) {
            int w = Integer.lowestOneBit(t);
            team[t] = w > 0 ? n / w + 1 - team[t - w] : 1;
            ans.append(team[t++]);
        } else {
            ans.append("(");
            write(n, round - 1);
            ans.append(",");
            write(n, round - 1);
            ans.append(")");
        }
    }


}
