package cn.dbdj1201.interview.test;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2022/8/13 11:49
 */
@Slf4j
public class TestMain20220813 {

    public static void main(String[] args) {
        List<Map<String, Object>> acctList;
        acctList = initTestData();
        processAcctList(acctList);
        System.out.println(acctList);
        System.out.println(acctList.size());
    }

    private static void processAcctList(List<Map<String, Object>> acctList) {
        acctList = acctList.stream()
                .filter(acct-> Integer.parseInt( acct.get("acctAge").toString()) >= 10)
                .collect(Collectors.toList());
    }

    private static List<Map<String, Object>> initTestData() {
        List<Map<String, Object>> acctList = new ArrayList<>();
        Map<String, Object> acct = new HashMap<>();
        acct.put("acctNo", "54654654ss");
        acct.put("acctName", "asdadaasd");
        acct.put("acctBank", "asdasdsdaasd");
        acct.put("acctAge", "10");

        Map<String, Object> acct1 = new HashMap<>();
        acct1.put("acctNo", "546546sad54");
        acct1.put("acctName", "asdadasda");
        acct1.put("acctBank", "asdasdaasdasd");
        acct1.put("acctAge", "2");


        Map<String, Object> acct2 = new HashMap<>();
        acct2.put("acctNo", "546546asdas54");
        acct2.put("acctName", "asdaasdasda");
        acct2.put("acctBank", "asdasdasdasasd");
        acct2.put("acctAge", "15");

        acctList.add(acct);
        acctList.add(acct1);
        acctList.add(acct2);
        return acctList;
    }

}
