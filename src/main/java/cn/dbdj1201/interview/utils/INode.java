package cn.dbdj1201.interview.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: dbdj1201
 * @Date: 2020-08-19 18:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class INode {
    int num;
    INode next;

    public INode(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "INode{" +
                "num=" + num +
                '}';
    }
}