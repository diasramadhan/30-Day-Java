package code;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class DateNCalenderClass {
    @Test
    void testDate() {
        Date date = new Date();
        System.out.println(date);

        Date tglLahir = new Date(1006605470000L);
        System.out.println(tglLahir);
    }

    @Test
    void testCalender() {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);


        Calendar birth = Calendar.getInstance();
        birth.set(2001,Calendar.NOVEMBER,24);

        Date birthTime = birth.getTime();
        System.out.println(birthTime);
    }
}
