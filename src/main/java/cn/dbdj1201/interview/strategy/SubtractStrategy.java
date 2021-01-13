package cn.dbdj1201.interview.strategy;

/**
 * @Author: yz1201
 * @Date: 2021/1/13 18:54
 */
public class SubtractStrategy implements OperateStrategy {
    @Override
    public double doOperation(double n1, double n2) {
        return n1 - n2;
    }
}
