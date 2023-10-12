package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.M784;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2023/9/7 16:09
 */
@Slf4j
public class T784 {

    public static void main(String[] args) {
        M784 m784 = new M784();
        System.out.println(m784.letterCasePermutation("1z3"));
        Map<String,Object> map = new HashMap<>();
        List<String> l = (List<String>) map.get("list");
        System.out.println(l);
      /*  List<String> list = new ArrayList<>();
        String s = list.toString();
        System.out.println(s);
        System.out.println(list);*/
    }
}
