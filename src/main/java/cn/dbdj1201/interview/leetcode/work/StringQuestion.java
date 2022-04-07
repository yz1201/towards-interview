package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/4/7 13:58
 */
@Slf4j
public class StringQuestion {

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequenceCopy("test", "t"));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();

        if (len1>=len2){
            findLongestCommonSubsequence(text1,text2);
        }else {
            findLongestCommonSubsequence(text2,text1);
        }

        return -1;
    }

    private static void findLongestCommonSubsequence(String text1,String text2){

        for (int i = 0; i < text1.length(); i++) {

            for (int i1 = 0; i1 < text2.length(); i1++) {


            }


        }



    }


    public static int longestCommonSubsequenceCopy(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

}
