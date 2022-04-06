package LabExercise10;

import java.util.GregorianCalendar;

public class MyDate {
    int year, month, day;

    public MyDate() {
        GregorianCalendar cal = new GregorianCalendar();
        this.year = cal.get(GregorianCalendar.YEAR);
        this.month = cal.get(GregorianCalendar.MONTH);
        this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapseTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapseTime);
        this.year = cal.get(GregorianCalendar.YEAR);
        this.month = cal.get(GregorianCalendar.MONTH);
        this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setTime(long elapseTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapseTime);
        this.year = cal.get(GregorianCalendar.YEAR);
        this.month = cal.get(GregorianCalendar.MONTH);
        this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }


    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        System.out.println(d1.year + "-" + d1.month + "-" + d1.day);
        MyDate d2 = new MyDate(34355555133101L);
        System.out.println(d2.year + "-" + d2.month + "-" + d2.day);
    }
}