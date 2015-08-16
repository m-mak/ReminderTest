import java.util.Date;

public class Reminder {
    Date startDate;
    Date endDate;
    int intervall;
    boolean ignore;

    public Reminder (Date startDate, Date endDate, int intervall) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.intervall = intervall;
        ignore = false;
    }


}
