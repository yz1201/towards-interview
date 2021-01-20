package cn.dbdj1201.interview.design.prototype;

import lombok.Data;

/**
 * @Author: yz1201
 * @Date: 2021/1/20 19:43
 */
@Data
public class Citation implements Cloneable {

    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("create citation");
    }

    void display() {
        System.out.println(this.name + " - " + this.info + " - " + this.college);
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
