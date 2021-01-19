package cn.dbdj1201.interview.design.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author: yz1201
 * @Date: 2021/1/19 18:57
 */
@AllArgsConstructor
@NoArgsConstructor
public class BusiOneAdapter implements Target {

    private Adaptee adaptee;

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
