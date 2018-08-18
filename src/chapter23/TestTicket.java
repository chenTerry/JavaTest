package chapter23;

public class TestTicket {

    public static void main(String[] args ) {

        Ticket db = new Ticket();
        Thread t1 = new Thread(() -> {
          while (true) {
                synchronized (db) {
                    int currTicketCount = db.getTicketCount();
                    if(currTicketCount > 0) {
                        db.sellTicket();
                    } else {
                        break;
                    }
                }

           }

        });

        t1.start();

        Thread t2 = new Thread(() -> {
            while (true) {
                synchronized (db) {
                    int currTicketCount = db.getTicketCount();
                    if(currTicketCount > 0) {
                        db.sellTicket();
                    } else {
                        break;
                    }
                }

            }

        });

        t2.start();
    }
}
