package cn.dbdj1201.interview.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Author: yz1201
 * @Date: 2021/1/13 18:56
 */
@AllArgsConstructor
@NoArgsConstructor
public class CalculateContext {

    private OperateStrategy operateStrategy;

    public void cal(double num1,double  num2){
        System.out.println(this.operateStrategy.doOperation(num1, num2));
    }

}
