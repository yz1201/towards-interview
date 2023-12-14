package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2023/12/14 9:01
 */
@Slf4j
public class M8 {

    public int myAtoi(String s) {
        s = s.trim();
        int num;
        if (s.contains("+") && s.contains("-")) return 0;
        if (s.startsWith(".")) return 0;
        if (s.isBlank() || s.isEmpty()) return 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '+' || c == '-' || (c - '0' >= 0 && c - '0' <= 9)) {
                sb.append(c);
            } else {
                break;
            }
        }
        if (sb.toString().isBlank() || sb.toString().isEmpty()) return 0;

        if (sb.toString().contains("+") || sb.toString().contains("-")) {
            if (sb.length() == 1) return 0;
            if (!sb.toString().startsWith("+") && !sb.toString().startsWith("-")) return 0;
        }

//        if (sb.toString().startsWith("+") || sb.toString().startsWith("-")) {
//            sb = new StringBuilder(sb.substring(1));
//        }
        //
        if (sb.toString().startsWith("-")) {
            //-2147483647
            if (Long.parseLong(sb.substring(1)) == Integer.MAX_VALUE) {
                return -Integer.MAX_VALUE;
            } else if (Long.parseLong(sb.toString()) == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (Long.parseLong(sb.substring(1)) > Integer.MAX_VALUE) {
                num = Integer.MAX_VALUE;
            } else {
                num = Integer.parseInt(sb.substring(1));
            }
        } else {
            if (sb.toString().startsWith("+")){
                if (Long.parseLong(sb.substring(1)) >= Integer.MAX_VALUE) {
                    num = Integer.MAX_VALUE;
                } else {
                    num = Integer.parseInt(sb.substring(1));
                }
            }else{
                if (Long.parseLong(sb.toString()) >= Integer.MAX_VALUE) {
                    num = Integer.MAX_VALUE;
                } else {
                    num = Integer.parseInt(sb.toString());
                }
            }
        }
        if (s.startsWith("-")) {
            if (num == Integer.MAX_VALUE)
                num = Integer.MIN_VALUE;
            else
                num = -num;
        }
        return num;
    }

    public int myAtoiCopy(String str) {
        Automaton automaton = new Automaton();
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            automaton.get(str.charAt(i));
        }
        return (int) (automaton.sign * automaton.ans);
    }

    public int myAtoiCopyV2(String s) {
        int sign = 1;
        int res = 0;
        int m = s.length();
        int i = 0;
        while(i < m && s.charAt(i)==' '){
            i++;
        }
        int start = i;
        for(; i < m; i++){
            char c = s.charAt(i);
            if(i==start && c=='+'){
                sign = 1;
            }else if(i==start && c=='-'){
                sign = -1;
            }else if(Character.isDigit(c)){
                int num = c-'0';
                if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10&&num>Integer.MAX_VALUE%10)){
                    return Integer.MAX_VALUE;
                }

                if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10&&-num<Integer.MIN_VALUE%10)){
                    return Integer.MIN_VALUE;
                }
                res = res*10+sign*num;
            }else{
                break;
            }
        }
        return res;
    }

}

class Automaton {
    public int sign = 1;
    public long ans = 0;
    private String state = "start";
    private Map<String, String[]> table = new HashMap<String, String[]>() {{
        put("start", new String[]{"start", "signed", "in_number", "end"});
        put("signed", new String[]{"end", "end", "in_number", "end"});
        put("in_number", new String[]{"end", "end", "in_number", "end"});
        put("end", new String[]{"end", "end", "end", "end"});
    }};

    public void get(char c) {
        state = table.get(state)[get_col(c)];
        if ("in_number".equals(state)) {
            ans = ans * 10 + c - '0';
            ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
        } else if ("signed".equals(state)) {
            sign = c == '+' ? 1 : -1;
        }
    }

    private int get_col(char c) {
        if (c == ' ') {
            return 0;
        }
        if (c == '+' || c == '-') {
            return 1;
        }
        if (Character.isDigit(c)) {
            return 2;
        }
        return 3;
    }
}

