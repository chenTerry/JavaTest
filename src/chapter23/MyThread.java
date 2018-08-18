package chapter23;

public class MyThread extends  Thread{

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.printf("第%d 次执行 - %s\n", i, Thread.currentThread().getName());

            try {
                long sleepTime = (long) (1000 * Math.random());
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("任务完成！" +Thread.currentThread().getName());
    }
}
