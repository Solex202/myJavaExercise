package ChapterEight;

public class Time {
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second){
        validateTime(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
//    @Override
//    public String toString(){
//        return hour + ":" + minute + ":" + second;
//
//    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    private void validateTime(int hour,int minute,int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }


    private  void validateHour(int hour){
        boolean hourIsNotValid = hour < 0 || hour > 23;
        if (hourIsNotValid) throw new IllegalArgumentException("Hour is invalid");
    }

    private void validateMinute(int minute){
        boolean minuteIsNotValid = minute < 0 || minute > 59;
        if(minuteIsNotValid) throw  new IllegalArgumentException("Minute is not valid");
    }

    private void validateSecond(int second){
        boolean secondIsNotValid = second < 0 || second > 59;
        if(secondIsNotValid) throw new IllegalArgumentException("Seconds is not valid");
    }

}
