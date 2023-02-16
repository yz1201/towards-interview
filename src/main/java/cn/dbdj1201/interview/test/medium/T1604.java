package cn.dbdj1201.interview.test.medium;

import cn.dbdj1201.interview.leetcode.work.middle.Q1604;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/2/8 16:00
 */
@Slf4j
public class T1604 {

    public static void main(String[] args) {
        Q1604 q1604 = new Q1604();
        String[] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};
        System.out.println(q1604.alertNamesCopy(keyName, keyTime));

//        List<String> strs = new ArrayList<>();
//        strs.add("1");
//        strs.add("1");
//        strs.add("1");
//        strs.add("5");
//        strs.add("1");
//
//        Iterator<String> iterator = strs.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        Iterator<String> iterator1 = strs.iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
