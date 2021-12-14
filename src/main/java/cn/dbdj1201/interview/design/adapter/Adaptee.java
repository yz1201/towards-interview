package cn.dbdj1201.interview.design.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yz1201
 * @Date: 2021/1/19 18:56
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Adaptee {

    public void specificRequest() {
        System.out.println("adapter specific processing...");
    }
}
