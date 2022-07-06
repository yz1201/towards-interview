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
        System.out.println(restoreIpAddresses("25525511135"));

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
        String partOne = s.substring(0,1);
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
}
