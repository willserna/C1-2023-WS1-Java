package co.com.movingu;

public class Ticket {
    private String id;

    private String time;

    public Ticket(String id) {
        this.id = "T-";
        this.time = "";
    }



    public void setId(String id) {
        int count = 0;
        String str = String.valueOf(count);
        this.id = id + str;
    }
}
