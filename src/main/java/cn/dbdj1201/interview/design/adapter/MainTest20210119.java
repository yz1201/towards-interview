package cn.dbdj1201.interview.design.adapter;

/**
 * @Author: yz1201
 * @Date: 2021/1/19 18:53
 */
public class MainTest20210119 {

    public static void main(String[] args) {
        Target target = new BusiOneAdapter(new Adaptee());
        target.request();
    }
}
