package cn.dbdj1201.interview.design.proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author: yz1201
 * @Date: 2021/1/14 17:59
 */
@AllArgsConstructor
@NoArgsConstructor
public class LenovoProxy implements ComputerSeller{

   private Lenovo lenovo;

    @Override
    public void sell() {
        System.out.println("processing before");
        this.lenovo.sell();
        System.out.println("processing after");
    }
}
