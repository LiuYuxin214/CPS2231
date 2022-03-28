package Assignment4;

import java.util.GregorianCalendar;

public class GregorianCalendarClass {

    public static void main(String[] args) {
        GregorianCalendar Cal = new GregorianCalendar();
        System.out.println(Cal.get(GregorianCalendar.YEAR));
        System.out.println(Cal.get(GregorianCalendar.MONTH));
        System.out.println(Cal.get(GregorianCalendar.DAY_OF_MONTH));
        Cal.setTimeInMillis(1234567898765L);
        System.out.println(Cal.get(GregorianCalendar.YEAR));
        System.out.println(Cal.get(GregorianCalendar.MONTH));
        System.out.println(Cal.get(GregorianCalendar.DAY_OF_MONTH));

    }

}
