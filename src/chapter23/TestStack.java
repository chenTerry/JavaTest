package chapter23;

import scala.Int;

public class TestStack {
    public static void main(String [] args) throws InterruptedException {

        Statck stack = new Statck();

        Thread producer = new Thread(() ->{
           char c;
           for(int i=0; i<10; i++){
               c = (char) (Math.random()*26 + 'A');
               stack.push(c);
               System.out.println("生产：" +c + " have:" + stack.getLength());

               try{
                   Thread.sleep((int) (Math.random()*1000));
               }catch (InterruptedException e) {

               }
           }
        });

        Thread consumer = new Thread(() ->{
           char c;
           for(int i=0; i<10; i++) {
               c = stack.pop();
               System.out.println("消费：" +c + " have:" + stack.getLength());
               try {
                   Thread.sleep((int) (Math.random()*1000));
               } catch (InterruptedException e) {

               }
           }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
