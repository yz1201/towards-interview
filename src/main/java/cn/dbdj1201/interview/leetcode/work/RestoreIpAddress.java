package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/7/6 15:39
 */
@Slf4j
public class RestoreIpAddress {

    public static void main(String[] args) {
//        System.out.println(isLegal("222"));
//        System.out.println(isLegal("222@"));
//        System.out.println(isLegal("0222"));
//        double dive = 222/1000;
//        System.out.println(dive);
//        System.out.println("121".substring(0,1));

//        System.out.println(restoreIpAddresses("0000"));
        System.out.println(restoreIpAddressesCopy("25525511135"));

    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        String point = ".";
        StringBuilder ip = new StringBuilder();
        int length = s.length();
        if (length < 4) return ans;

        for (int i = 0; i < length; i++) {
            String onePart = s.substring(0, i + 1);
            if (!isLegal(onePart)) continue;
            ip.append(onePart).append(point);
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                String twoPart = s.substring(i + 1, left + 1);
                String lastPart = s.substring(right);
                String midPart = s.substring(left + 1, right);
                if (!isLegal(twoPart)) {
                    if (twoPart.length() <= 3)
                        left++;
                    else if (lastPart.length() <= 3)
                        right--;
                    else break;
                } else if (!isLegal(lastPart)) {
                    if (lastPart.length() <= 3) right--;
                    else if (twoPart.length() <= 3) left++;
                    else break;
                } else if (!isLegal(midPart)) {
                    if (twoPart.length() <= 3)
                        left++;
                    else if (lastPart.length() <= 3)
                        right--;
                    else
                        break;
                } else {
                    ans.add(ip.append(twoPart).append(point).append(midPart).append(point).append(lastPart).toString());
                    if (twoPart.length() <= 3)
                        left++;
                    else if (lastPart.length() <= 3)
                        right--;
                    else break;
                }
            }
        }
        return ans;
    }


    public static List<String> restoreIpAddressesV1(String s) {
        List<String> ans = new ArrayList<>();
        String partOne = s.substring(0, 1);
        return ans;
    }

    private static boolean isLegal(String ip) {
        int length = ip.length();
        if (length == 1) return true;
        int part;
        try {
            part = Integer.parseInt(ip);
            if (part > 255 || part < 0) return false;
        } catch (NumberFormatException e) {
            return false;
        }

        //050 3 50/ 100
        int res = (int) (part / Math.pow(10, length - 1));
        return res != 0;
    }


    static final int SEG_COUNT = 4;
    static List<String> ans = new ArrayList<>();
    static int[] segments = new int[SEG_COUNT];

    public static List<String> restoreIpAddressesCopy(String s) {
        segments = new int[SEG_COUNT];
        dfs(s, 0, 0);
        return ans;
    }

    public static void dfs(String s, int segId, int segStart) {
        // 如果找到了 4 段 IP 地址并且遍历完了字符串，那么就是一种答案
        if (segId == SEG_COUNT) {
            if (segStart == s.length()) {
                StringBuilder ipAddr = new StringBuilder();
                for (int i = 0; i < SEG_COUNT; ++i) {
                    ipAddr.append(segments[i]);
                    if (i != SEG_COUNT - 1) {
                        ipAddr.append('.');
                    }
                }
                ans.add(ipAddr.toString());
            }
            return;
        }

        // 如果还没有找到 4 段 IP 地址就已经遍历完了字符串，那么提前回溯
        if (segStart == s.length()) {
            return;
        }

        // 由于不能有前导零，如果当前数字为 0，那么这一段 IP 地址只能为 0
        if (s.charAt(segStart) == '0') {
            segments[segId] = 0;
            dfs(s, segId + 1, segStart + 1);
        }

        // 一般情况，枚举每一种可能性并递归
        int addr = 0;
        for (int segEnd = segStart; segEnd < s.length(); ++segEnd) {
            addr = addr * 10 + (s.charAt(segEnd) - '0');
            if (addr > 0 && addr <= 0xFF) {
                segments[segId] = addr;
                dfs(s, segId + 1, segEnd + 1);
            } else {
                break;
            }
        }
    }

}
