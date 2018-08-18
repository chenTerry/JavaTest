package chapter21;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> q1 = new Queue<String>();
        q1.queue("A");
        q1.queue("B");
        q1.queue("C");
        q1.queue("D");
        System.out.println(q1);
        while (!q1.isEmpty()) {
            System.out.println(q1.dequeue());
            System.out.println(q1);
        }
    }
}
