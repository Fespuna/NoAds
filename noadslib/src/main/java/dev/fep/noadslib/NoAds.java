package dev.fep.noadslib;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Created by Ferran on 26/06/2018.
 */
public class NoAds {

    public static String tdate;

    public static boolean get(){

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTime commentDate = formatter.parseDateTime(tdate+" 00:00:00");
     //   DateTime commentDate = formatter.parseDateTime("2017-09-20 00:00:00");
        DateTime nowLocal = new DateTime();
        Period period = new Period(commentDate, nowLocal);

        int days = period.getDays();

        if(days>=1){
            return true;
        }else{
            return false;
        }

    }

}
