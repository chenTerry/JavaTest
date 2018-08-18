package chapter23;

public class Ticket {

    private int ticketCount = 5;

    public  int getTicketCount() {
        return ticketCount;
    }

    public  void sellTicket() {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("第%d号票，已经售出\n", ticketCount);
        ticketCount --;
    }
}
