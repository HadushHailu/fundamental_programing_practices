package simple_formal_exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class initi_class {

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        Date d = cal.getTime(); //get the from GregorianCalendar

        Date dd = new Date();


        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(dd.getTime());

        String DATE_PATTERN = "MM/dd/yyyy";
        String date = "03/03/2023";
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(DATE_PATTERN));
        System.out.println(localDate);


    }
}
