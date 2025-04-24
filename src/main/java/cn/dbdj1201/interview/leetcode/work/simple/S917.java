package cn.dbdj1201.interview.leetcode.work.simple;

import cn.hutool.Hutool;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2024/7/17 14:40
 */
@Slf4j
public class S917 {

    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int length = s.length();
        char[] chars = s.toCharArray();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(chars[i])) {
                arr.add(i);
            }
        }


        for (char c : chars) {

        }
        String reverse = sb.reverse().toString();

        return "";
    }

    public static void main(String[] args) {
        char[] cs = {'a', 'b', 'c', 'd'};
        System.out.println(Convert.bytesToInt("123".getBytes(Charset.defaultCharset())));
//a-bC-dEf-ghIj
//j-Ih-gfE-dCba
//j-Ih-gEf-dCba
//        System.out.println(Arrays.toString(cs));
//
//        String s = "abc";
//        System.out.println(s.substring(0, s.length() -9));

//
//        Map<String, Object> m1 = new HashMap<>();
//        m1.put("t1", 1);
//        Map<String, Object> m2 = new HashMap<>();
//        m2.put("t2",2);
//        m2.put("t3",3);
//        m1.putAll(m2);
//        System.out.println(m1);
//        m1.put("t4", m2);
//        JSONObject jsonObject = JSONUtil.parseObj(m1);
//        System.out.println(jsonObject);

        List<String> l = new ArrayList<>();
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("1");
        l.add("5");
        String s = l.stream().findAny().get();
        System.out.println(s);
        l.add(0, "5");
        System.out.println(l);

        String num = "10.0";
        System.out.println(Double.valueOf(num));
        BigDecimal bigDecimal = new BigDecimal("0.0");
        System.out.println(bigDecimal.toBigInteger().intValue());

        int i = 10;
//        for (int            )
    }

    public void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (arr[i] < arr[i1]){

                }
            }
        }
    }

    public String reverseOnlyLettersV1(String s) {
//        IdcardUtil.
        int length = s.length();
        if (length < 2) return s;
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                char temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
                left++;
                right--;
            } else if (!Character.isLetter(chars[left])) {
                left++;
            }
//            else if (Character.isLetter(chars[right])) {
//                right--;
//            } else {
//                left++;
//                right--;
//            }
        }
        return new String(chars);
    }

    public String reverseOnlyLettersCp(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int left = 0, right = n - 1;
        while (true) {
            while (left < right && !Character.isLetter(s.charAt(left))) { // 判断左边是否扫描到字母
                left++;
            }
            while (right > left && !Character.isLetter(s.charAt(right))) { // 判断右边是否扫描到字母
                right--;
            }
            if (left >= right) {
                break;
            }
            swap(arr, left, right);
            left++;
            right--;
        }
        return new String(arr);
    }

    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
