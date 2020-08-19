package cn.dbdj1201.interview.utils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yz1201
 * @date 2020-08-18 22:07
 **/
@Slf4j
public class CollectionUtils {

    public static ILinkedList generateList(int size) {
        ILinkedList list = new ILinkedList();
        for (int i = 0; i < size; i++) {
            list.add(new INode(i + 1));
        }
        return list;
    }
}
