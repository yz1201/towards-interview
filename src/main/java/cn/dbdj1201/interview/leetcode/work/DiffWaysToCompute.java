package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/7/1 8:44
 */
@Slf4j
public class DiffWaysToCompute {
    public static void main(String[] args) {
        System.out.println(diffWaysToComputeCopy2("21-1"));
    }

    public static List<Integer> diffWaysToCompute(String expression) {
        //expression = "2-1-1"
        char minus = '-';
        char plus = '+';
        char multi = '*';
        String copy;
        copy = expression.replaceAll("-","/").replaceAll("\\+","/").replaceAll("\\*","/");
        System.out.println(copy);
        System.out.println(expression);
        String[] split = copy.split("/");
        int length = split.length;
        for (int i = 0; i < length; i++) {

        }
        return null;
    }


    //添加一个 map
    static HashMap<String,List<Integer>> map = new HashMap<>();
    public static List<Integer> diffWaysToComputeCopy(String input) {
        if (input.length() == 0) {
            return new ArrayList<>();
        }
        //如果已经有当前解了，直接返回
        if(map.containsKey(input)){
            return map.get(input);
        }
        List<Integer> result = new ArrayList<>();
        int num = 0;
        int index = 0;
        while (index < input.length() && !isOperation(input.charAt(index))) {
            num = num * 10 + input.charAt(index) - '0';
            index++;
        }
        if (index == input.length()) {
            result.add(num);
            //存到 map
            map.put(input, result);
            return result;
        }
        for (int i = 0; i < input.length(); i++) {
            if (isOperation(input.charAt(i))) {
                List<Integer> result1 = diffWaysToComputeCopy(input.substring(0, i));
                List<Integer> result2 = diffWaysToComputeCopy(input.substring(i + 1));
                for (int j = 0; j < result1.size(); j++) {
                    for (int k = 0; k < result2.size(); k++) {
                        char op = input.charAt(i);
                        result.add(calculate(result1.get(j), op, result2.get(k)));
                    }
                }
            }
        }
        //存到 map
        map.put(input, result);
        return result;
    }

    private static int calculate(int num1, char c, int num2) {
        switch (c) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
        }
        return -1;
    }

    private static boolean isOperation(char c) {
        return c == '+' || c == '-' || c == '*';
    }


    static char[] cs;
    public static List<Integer> diffWaysToComputeCopy2(String s) {
        cs = s.toCharArray();
        return dfs(0, cs.length - 1);
    }
    static List<Integer> dfs(int l, int r) {
        List<Integer> ans = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (cs[i] >= '0' && cs[i] <= '9') continue;
            List<Integer> l1 = dfs(l, i - 1), l2 = dfs(i + 1, r);
            for (int a : l1) {
                for (int b : l2) {
                    int cur = 0;
                    if (cs[i] == '+') cur = a + b;
                    else if (cs[i] == '-') cur = a - b;
                    else cur = a * b;
                    ans.add(cur);
                }
            }
        }
        if (ans.isEmpty()) {
            int cur = 0;
            for (int i = l; i <= r; i++) cur = cur * 10 + (cs[i] - '0');
            ans.add(cur);
        }
        return ans;
    }




}
