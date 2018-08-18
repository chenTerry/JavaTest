package chapter20;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_test {
    public static void main(String[] args) {
        Set set = new HashSet();
        String b = "B";
        set.add("A");
        set.add(100);
        set.add("B");
        set.add(b);
        set.add("C");

        System.out.println(set);
        for(Object item: set) {
            String s = String.valueOf(item);
            System.out.println("读取元素：" + s);
        }

        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object item = it.next();
            String s = String.valueOf(item);
            System.out.println("读取的元素为：" + s);
        }
    }
}
