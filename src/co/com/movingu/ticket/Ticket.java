package co.com.movingu.ticket;

import java.time.LocalDateTime;



public class Ticket {
    String str1 = "T-";
    protected String id;
    protected LocalDateTime timeStart;
    protected LocalDateTime timeEnd;
    protected String status ;
    protected boolean helmet;
    protected int debt;

    public Ticket(String id, LocalDateTime timeStart, LocalDateTime timeEnd, String status, boolean helmet, int debt) {
        this.id = id;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.status = status;
        this.helmet = helmet;
        this.debt = debt;
    }



    public String getId() {
        return id;
    }
    public String setId(int count) {

        String str = String.valueOf(count);
        this.id = str1 + str;
        return id;
    }
    public LocalDateTime setTimeStart(LocalDateTime t) {

        timeStart = t;
        return timeStart;
    }
    public String setStatus(String status) {
        this.status = status;
        return status;
    }
    public int setDebt(int money) {
        this.debt = money;
        return debt;
    }
}

