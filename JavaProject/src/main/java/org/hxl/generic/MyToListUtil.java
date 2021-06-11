package org.hxl.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法
 * @author Grant
 * @create 2021-06-11 13:50
 */
public class MyToListUtil {
public static <T> List<T> toList(Iterable<T> iterable){
    List<T> res = new ArrayList<>();
    for (T t : iterable) {
        res.add(t);
    }
    return res;
}
}
