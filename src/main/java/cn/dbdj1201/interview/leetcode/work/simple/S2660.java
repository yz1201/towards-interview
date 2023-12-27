package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/12/27 9:08
 */
@Slf4j
public class S2660 {

    public int isWinner(int[] player1, int[] player2) {
        if (countScore(player1) > countScore(player2)) return 1;
        else if (countScore(player1) < countScore(player2)) return 2;
        return 0;
    }

    private int countScore(int[] player) {
        int length = player.length;
        int index = length - 1;
        int score = 0;
        while (index >= 0) {
            int validChecker = index - 1;
            if (validChecker >= 0) {
                int tempChecker = validChecker - 1;
                if (player[validChecker] == 10 || (tempChecker >= 0 && player[tempChecker] == 10))
                    score += player[index] * 2;
                else score += player[index];
            } else {
                score += player[index];
            }
            index--;
        }
        return score;
    }
}
