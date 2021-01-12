package cn.dbdj1201.interview.design.builder.gf;

/**
 * @Author: yz1201
 * @Date: 2021/1/12 16:30
 */
public class GfBuilder {

    GirlFriend gf = new GirlFriend();

    public GfBuilder build(String name) {
        gf.setName(name);
        return this;
    }

    public GfBuilder build(Integer age) {
        gf.setAge(age);
        return this;
    }

    public GirlFriend build() {
        return gf;
    }
}