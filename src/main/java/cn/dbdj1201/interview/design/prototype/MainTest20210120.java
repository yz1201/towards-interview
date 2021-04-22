package cn.dbdj1201.interview.design.prototype;

/**
 * @Author: yz1201
 * @Date: 2021/1/20 19:43
 */
public class MainTest20210120 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("t1","aaa","heihei");
        citation.display();
        Citation clone = citation.clone();
        clone.setName("t2");
        clone.display();
    }
}
