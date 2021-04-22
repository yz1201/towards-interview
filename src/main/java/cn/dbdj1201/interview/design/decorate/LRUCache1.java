package cn.dbdj1201.interview.design.decorate;

import java.util.LinkedHashMap;

/**
 * @Author: dbdj1201
 * @Date: 2020-09-14 10:25
 */
public class LRUCache1<K, V> extends LinkedHashMap<K, V> {

    //首先设定最大缓存空间 MAX_ENTRIES 为 3；
    private static final int MAX_ENTRIES = 3;

    //之后使用LinkedHashMap的构造函数将 accessOrder设置为 true，开启 LRU顺序；
    public LRUCache1() {
        //看着像装饰器，说实话0
        super(MAX_ENTRIES, 0.75f, true);
    }

    //最后覆盖removeEldestEntry(）方法实现，在节点多于 MAX_ENTRIES 就会将最近最少使用的数据移除。
    //因为这个函数默认返回false，不重写的话缓存爆了的时候无法删除最近最久未使用的节点
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        //在容量超过最大允许节点数的时候返回true，使得在afterNodeInsertion函数中能执行removeNode()
        return size() > MAX_ENTRIES;
    }

    public static void main(String[] args) {
        LRUCache1<Integer, Integer> cache = new LRUCache1<>();
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.get(1);
        cache.get(1);
        cache.get(1);
        cache.get(1);
        cache.get(2);
        cache.get(3);
        cache.get(3);
        cache.get(3);
        cache.put(4, 4);
        System.out.println(cache.keySet());
    }
}
