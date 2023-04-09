package com.mashibing.dp.strategy;

/**
 * 这里是我们自己定义的Comparable接口
 * @param
 */

// 不使用泛型的
/*public interface Comparable {
    int compareTo(Object o);
}*/

// 使用泛型的
public interface Comparable<T> {
    int compareTo(T o);
}
