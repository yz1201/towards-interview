package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/2/25 8:45
 */
@Slf4j
public class ReverseStrTaskII {

    public static void main(String[] args) {
        System.out.println(reverseStr1("krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc", 20));
//        System.out.println(reverseStr("a", 2));
    }

    public static String reverseStr(String s, int k) {
        int len = s.length();
        if (len < 1)
            return "";
        StringBuilder sb;
        if (len < k)
            return new StringBuilder(s.substring(0, len)).reverse().toString();
        else
            sb = new StringBuilder(s.substring(0, k));
        sb.reverse();
        if (len <= k * 2) {
            sb.append(s.substring(k));
            return sb.toString();
        }
        sb.append(s, k, k * 2);
        if (len - k * 2 < k) {
            sb.append(new StringBuilder(s.substring(k * 2)).reverse());
        } else if (len - k * 2 < k * 2 && len - k * 2 >= k) {
            sb.append(new StringBuilder(s.substring(k * 2, k * 3)).reverse());
            sb.append(s, 3 * k, len);
        }else{
            sb.append(s,k*2,len);
        }
        return sb.toString();
    }

    public static String reverseStr1(String s, int k) {
        int len = s.length();
        if (len < 1)
            return "";
        StringBuilder sb;
        if (len < k)
            return new StringBuilder(s.substring(0, len)).reverse().toString();
        else
            sb = new StringBuilder(s.substring(0, k));
        sb.reverse();
        if (len <= k * 2) {
            sb.append(s.substring(k));
            return sb.toString();
        }
        sb.append(s, k, k * 2);
        if (len - k * 2 < k) {
            sb.append(new StringBuilder(s.substring(k * 2)).reverse());
        } else if (len - k * 2 < k * 2 && len - k * 2 >= k) {
            sb.append(new StringBuilder(s.substring(k * 2, k * 3)).reverse());
            sb.append(s, 3 * k, len);
        }else{
           sb.append(reverseStr1(s.substring(2*k),k));
        }
        return sb.toString();
    }


    public String reverseStrCopy(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i += 2 * k) {
            reverse(arr, i, Math.min(i + k, n) - 1);
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
