package chapter21;

import java.util.ArrayList;
import java.util.List;

public class Queue <T>{

    private List<T> items;

    //构造方法初始化队列
    public Queue() {
        this.items = new ArrayList<T>();
    }

    /**
     * 入队方法
     * @param item 需要加入队列的元素
     */
    public void queue(T item) {
        this.items.add(item);
    }

    /**
     * 出对方法
     * @return 返回出对元素
     */
    public T dequeue() {
        if (this.items.isEmpty()) {
            return null;
        } else {
            return this.items.remove(0);
        }
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public String toString() {
        String result="";
        for(int i=0; i<items.size(); i++) {
            result += i+":" + items.get(i) +"\t";
        }
        if(items.size()==0) {
            result = null;
        }
        return result;


    }
}
