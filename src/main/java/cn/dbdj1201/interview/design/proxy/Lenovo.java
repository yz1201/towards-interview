package cn.dbdj1201.interview.design.proxy;

/**
 * @Author: yz1201
 * @Date: 2021/1/14 17:57
 */
public class Lenovo implements ComputerSeller {

    @Override
    public void sell() {
        System.out.println("成本价 8800");
    }
}
