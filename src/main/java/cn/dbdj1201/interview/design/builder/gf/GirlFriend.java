package cn.dbdj1201.interview.design.builder.gf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yz1201
 * @Date: 2021/1/12 16:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GirlFriend {
    private String name;
    private Integer age;


    class GfBuilder1 {

        GirlFriend gf = new GirlFriend();

        public GfBuilder1 build(String name) {
            gf.setName(name);
            return this;
        }

        public GfBuilder1 build(Integer age) {
            gf.setAge(age);
            return this;
        }

        public GirlFriend build() {
            return gf;
        }
    }
}
