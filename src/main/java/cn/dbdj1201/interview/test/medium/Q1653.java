package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/3/6 11:05
 */
@Slf4j
public class Q1653 {
    public int minimumDeletions(String s) {



        return -1;
    }

    private boolean judgeIsBalance(String s){
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c1 = chars[i];
            for (int j = i+1; j<chars.length;j++){
                if (chars[i] == 'b' && chars[j] == 'a') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q1653 q1653 = new Q1653();

        System.out.println(q1653.judgeIsBalance("aaaaaaabb"));
    }

    public int minimumDeletionsCopy(String s) {
        int leftb = 0, righta = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                righta++;
            }
        }
        int res = righta;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                righta--;
            } else {
                leftb++;
            }
            res = Math.min(res, leftb + righta);
        }
        return res;
    }

}
