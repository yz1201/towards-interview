package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/10/31 10:20
 */
@Slf4j
public class Q246 {

    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');  //满足要求的数字对
        int left = 0, right = num.length() - 1;     //双指针初始化
        while(left <= right){
            if(map.get(num.charAt(left)) == null || map.get(num.charAt(right)) == null)     //不满足要求的数字
                return false;
            if(map.get(num.charAt(left)) != num.charAt(right))  //check一下是否真的中心对称
                return false;
            left++;
            right--;
        }
        return true;
    }
}
