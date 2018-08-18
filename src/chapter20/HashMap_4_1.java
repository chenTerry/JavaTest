package chapter20;

import java.util.HashMap;
import java.util.Map;

public class HashMap_4_1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(100,"张三");
        map.put(101, "李四");
        map.put(102,"王五");
        map.put(103, "董六");
        System.out.println("all map: " + map);
        map.put(100,"开心");
        System.out.println(map);

        System.out.println(map.get(100));
        System.out.println(map.get(102));
        System.out.println(map.remove(101));
        System.out.println(map.containsKey(100));
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
    }
}
