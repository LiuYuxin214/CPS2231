package Assignment4;

import java.util.Date;

public class DateClass {

    public static void main(String[] args) {
        for (long i = 10000; i <= 1000000000; i *= 10) {
            Date date = new Date(i);
            String s2 = date.toString();
            System.out.println(s2);
        }
    }

}
