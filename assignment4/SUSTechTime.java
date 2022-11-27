package assignment4;



public class SUSTechTime {

    private Weekday weekday;
    private WeekType weekType;

    public SUSTechTime(String startTime, String endTime, Weekday weekday, WeekType weekType) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekday = weekday;
        this.weekType = weekType;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public WeekType getWeekType() {
        return weekType;
    }

    private String startTime,endTime;

    void SUSTechTime(String startTime, String endTime, Weekday weekday, WeekType weekType) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekday = weekday;
        this.weekType = weekType;
    }

    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }

    public String toString(){
        return "SUSTechTime{"+startTime+" ~ "+endTime+" | "+weekday+" | "+weekType+" week}";
    }

}

