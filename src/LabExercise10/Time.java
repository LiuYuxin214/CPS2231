package LabExercise10;

import java.util.Date;

public class Time {

    int hour, minute, second;

    public Time() {
        Date date = new Date();
        hour = date.getHours();
        minute = date.getMinutes();
        second = date.getSeconds();
    }

    public Time(long elapseTime) {
        Date date = new Date(elapseTime);
        hour = date.getHours() - 8;
        minute = date.getMinutes();
        second = date.getSeconds();

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        Date date = new Date(elapseTime);
        hour = date.getHours() - 8;
        minute = date.getMinutes();
        second = date.getSeconds();
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
