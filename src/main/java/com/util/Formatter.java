package com.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Component
public class Formatter {

    @Bean
    public String numCommaFormatter(@Value("0") Integer num) {
        if (num == 0) {
            return null;
        }

        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(num);
    }

    @Bean
    public String dateFormatter(@Value("0") String date) {
        Date createdDate = new Date(Long.parseLong(date)*1000);
        Date currentDate = new Date();

        long milliseconds = Math.abs(currentDate.getTime() - createdDate.getTime());
        double hours = Math.floor(milliseconds/36e5);

        if (hours < 24) {
            return (int)hours + ((int)hours > 1 ? " HOURS " : " HOUR ") + "AGO";
        } else if (hours < 168) {
            return (int)Math.floor(hours/24) + ((int)Math.floor(hours/24) > 1 ? " DAYS " : " DAY ") + "AGO";
        }
        String resultDate = "";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(createdDate);
        resultDate += new SimpleDateFormat("MMMM").format(calendar.getTime()).toUpperCase(Locale.ROOT); // MONTH NAME
        resultDate += " " + new SimpleDateFormat("d").format(calendar.getTime()); // DAY NUMBER
        if (calendar.get(Calendar.YEAR) != Calendar.getInstance().get(Calendar.YEAR)) {
            resultDate += ", " + new SimpleDateFormat("y").format(calendar.getTime()); // YEAR
        }


        return resultDate;
    }
}
