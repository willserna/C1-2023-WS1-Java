package co.com.movingu;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Ticket {
    private String id;

    private LocalDateTime time;

    public Ticket(String id, String time) {
        this.id = "T-";
        this.time = LocalDateTime.now();
    }



    public void setId(String id) {
        int count = 0;
        String str = String.valueOf(count);
        this.id = id + str;
    }
    public void setTime(String time) {
        LocalDateTime now = LocalDateTime.now();
        this.time = now;
    }
}
