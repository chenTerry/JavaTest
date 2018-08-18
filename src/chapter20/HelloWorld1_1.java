package chapter20;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld1_1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add(10);
        list.add(true);
        list.add("B");

        System.out.println(list);

        System.out.println("indexOf B :" + list.indexOf("B"));
        System.out.println("lastIndexOf B:" + list.lastIndexOf("B"));
        list.remove("B");
        System.out.println(list);
        System.out.println(list.remove("B"));
        System.out.println(list);
        System.out.println(list.remove("B"));
        list.set(1, 100);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add(1);
        list.add(2);
        System.out.println(list);
        int item = (Integer)list.get(0);
        System.out.println(item);
    }
}
