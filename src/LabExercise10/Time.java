package LabExercise10;

public class Time {

    long hour, minute, second;

    public Time() {
        hour = System.currentTimeMillis() % (1000 * 3600 * 24) / 1000 / 3600;
        minute = System.currentTimeMillis() % (1000 * 3600) / 1000 / 60;
        second = System.currentTimeMillis() % (1000 * 60) / 1000;
    }

    public Time(long elapseTime) {
        hour = elapseTime % (1000 * 3600 * 24) / 1000 / 3600;
        minute = elapseTime % (1000 * 3600) / 1000 / 60;
        second = elapseTime % (1000 * 60) / 1000;

    }

    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        hour = elapseTime % (1000 * 3600 * 24) / 1000 / 3600;
        minute = elapseTime % (1000 * 3600) / 1000 / 60;
        second = elapseTime % (1000 * 60) / 1000;
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);
        System.out.println("time1: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("time2: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println("time3: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }

}
