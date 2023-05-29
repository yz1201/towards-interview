package cn.dbdj1201.interview.test;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @Author: yz1201
 * @Date: 2023/5/29 14:09
 */
public interface TestInter {
    String checkField(List<String> params, Consumer<Object> consumer);

}

class TestInterImpl implements TestInter{

    @Override
    public String checkField(List<String> params, Consumer<Object> consumer) {

//        TimeUnit.MILLISECONDS
        return null;
    }
}
