package chapter23;


public class TestThread {

    static int value = 0;
    public static void main(String[] args) throws InterruptedException {
       /* Thread t1 = new Thread(new Runner());
        t1.start();

        Thread t2 = new Thread(new Runner());
        t2.start();*/
        /*MyThread t1 = new MyThread("test---1");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        MyThread t2 = new MyThread("test2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();*/
        Thread t1 = new Thread(() ->{
           System.out.println("new Thread!");

           for (int i = 0; i < 10; i++) {
               System.out.printf("第%d次执行线程%s\n", i, Thread.currentThread().getName());
               /*long sleepTime = (long) (1000 * Math.random());
               Thread.sleep(sleepTime);*/
               value++;
           }

           System.out.println("线程执行完毕！"+ Thread.currentThread().getName());
        });

        t1.start();
        //t1.join();

        System.out.println("value = " + value);
        System.out.println("主线程 结束...");
    }
}
