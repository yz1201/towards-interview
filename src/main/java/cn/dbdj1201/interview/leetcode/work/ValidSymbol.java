package cn.dbdj1201.interview.leetcode.work;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: yz1201
 * @Date: 2021/12/16 21:18
 */
@Slf4j
public class ValidSymbol {


    public static void main(String[] args) {
        String testStr = "()";
        System.out.println(isValid(testStr));
    }

    public static boolean isValid0(String s) {
        return StrUtil.reverse(s).equals(s);
    }

    public static boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }

        List<Character> l1 = new ArrayList<>();
        l1.add('(');
        l1.add('[');
        l1.add('{');

        Stack<Character> stack = new Stack<>();
        boolean result = true;
        int i = 0;
        while (i < len) {
            if (l1.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (i == 0){
                    return false;
                }

                if (stack.isEmpty()){
                    return false;
                }

                Character pop = stack.pop();

                switch (pop) {
                    case '(':
                        result = s.charAt(i) == ')';
                        break;
                    case '[':
                        result = s.charAt(i) == ']';
                        break;
                    case '{':
                        result = s.charAt(i) == '}';
                        break;
                }

                if (!result) {
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }

    public static boolean isValid1(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }
        int i = 0;
        int j = length - 1;
        boolean result = true;
        while (i < j) {
            switch (s.charAt(i)) {
                case '(':
                    result = s.charAt(j) == ')';
                    break;
                case '[':
                    result = s.charAt(j) == ']';
                    break;
                case '{':
                    result = s.charAt(j) == '}';
                    break;
                default:
                    result = false;
                    break;
            }

            if (!result) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
