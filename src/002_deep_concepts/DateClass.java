package simple_formal_deep_concepts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClass {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        Date date = (Date)d.clone();
        System.out.println(date);

        Date date1 = new Date(1000000);

        System.out.println(d.getTime());
        System.out.println(date1.compareTo(date));

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.getTime());
        gregorianCalendar.setTime(date1);
        System.out.println(gregorianCalendar.getTime());

        System.out.println(new GregorianCalendar(1999,3,13,12,12,12).getTime());
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        System.out.println(gregorianCalendar.get(Calendar.MONTH));
        System.out.println(gregorianCalendar.get(Calendar.DATE));
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(1993,9,12));
        LocalDate localDate = LocalDate.of(1999,3,12);
        System.out.println(localDate);
        System.out.println(localDate.getMonth().getValue()-1);
        //System.out.println(LocalDate.parse(localDate, DateTimeFormatter.ofPattern("MM/dd/yyyy")));
    }
}
