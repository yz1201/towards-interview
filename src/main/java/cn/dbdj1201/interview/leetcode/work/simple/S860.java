package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2024/2/20 14:28
 */
@Slf4j
public class S860 {

    public boolean lemonadeChange(int[] bills) {
        boolean res = true;
        List<Integer> balance = new LinkedList<>();
        if (bills == null || bills.length == 0)
            return false;
        if (bills[0] != 5) return false;
        balance.add(5);
        for (int i = 1; i < bills.length; i++) {
            if (bills[i] == 5) {
                balance.add(5);
                continue;
            }

            if (bills[i] == 10) {
                balance.add(10);
                if (balance.contains(5)) {
                    Integer num = 5;
                    balance.remove(num);
                    continue;
                } else {
                    res = false;
                    break;
                }
            }

            if (bills[i] == 20) {
                if (balance.contains(10) && balance.contains(5)) {
                    Integer num1 = 10;
                    Integer num2 = 5;
                    balance.remove(num1);
                    balance.remove(num2);
                    continue;
                }
                if (balance.stream().filter(num -> num == 5).mapToInt(Integer::intValue).count() >= 3) {
                    Integer num = 5;
                    balance.remove(num);
                    balance.remove(num);
                    balance.remove(num);
                    continue;
                }
                res = false;
                break;
            }
        }
        return res;
    }

    public boolean lemonadeChangeCp(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
