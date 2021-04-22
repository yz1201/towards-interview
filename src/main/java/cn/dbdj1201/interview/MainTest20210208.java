package cn.dbdj1201.interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2021/1/7 19:18
 */
public class MainTest20210208 {
    public static void main(String[] args) {


//        List<String> names = new ArrayList<>();
//
//        names.add("t1");
//        names.add("t2");
//        names.add("t3");
//        names.add("t4");
//        names.add("t5");
//        names.add("t6");

//        names.stream()



        long l = 1614761236000L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(new Date(l)));


    }


}
