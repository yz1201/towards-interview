package cn.dbdj1201.interview.test.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/10/13 15:27
 */
@Slf4j
public class T2512 {

    public static void main(String[] args) {
        M2512 m2512 = new M2512();
        String[] positive_feedback = {"pyuknvau", "nc", "hwcpe", "wn"};
        String[] negative_feedback = {"bjzzjcgxv", "dibldp", "pmlb"};
        String[] report = {"qws z pmlb xmcugvuos lpnygddx bjzzjcgxv hwcpe pmlb pmlb rocg",
                "hwcpe pyuknvau dibldp bjzzjcgxv bjzzjcgxv hwcpe wn pmlb pyuknvau wodnvd",
                "dibldp dibldp gna dibldp pmlb pyuknvau pyuknvau nc iygs rkhtnjreq",
                "pmlb aas wn hwcpe bjzzjcgxv otird pyuknvau fdl bjzzjcgxv dibldp"};
        int[] id = {357574114,899543310,676388750,793586311};
        System.out.println(m2512.topStudentsV2(positive_feedback, negative_feedback, report, id, 2));

//        Arrays.sort(id);
//
//        System.out.println(Arrays.toString(id));
        int a = 5==4 ? 5-4:5-5;
        System.out.println(a);
    }
}
