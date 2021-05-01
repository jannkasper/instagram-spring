package com.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

@Component
public class Formatter {

    @Bean
    public String numCommaFormatter(@Value("0") Integer num) {
        if (num == null || num < 0) {
            return "";
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

    @Bean
    public String numFormatter(@Value("0") Integer num) {
        if (num == null || num < 0) {
            return "";
        }

        if (num > 999 && num < 1000000) {
            return String.format("%.1fk", ((float)num)/1000); // convert to K for number from > 1000 < 1 million
        }else if(num >= 1000000){
            return String.format("%.1fM", ((float)num)/1000000); // convert to M for number from > 1 million
        }
        return num.toString(); // if value < 1000, nothing to do
    }

    @Bean
    public String urlFormatter(@Value("") String url) {
        try {
            URL u = new URL(url);
            URI uri = u.toURI();
            return uri.getHost();
        } catch (Exception e) {
            return "";
        }
    }

    @Bean
    public String bioFormatter(@Value("") String bio) {
        if (bio == null) {
            return "";
        }
        return bio.replaceAll("\n", "<br/>");
    }

    @Bean
    public String hashtagFormatter(@Value("") String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        String[] hashArray = Pattern.compile("#(\\w+)").matcher(text).results()
                .map(MatchResult::group)
                .toArray(String[]::new);

        for(String hash : hashArray) {
            text = text.replaceAll(hash + "\\b", "<a href=\"/tags/" + hash.substring(1) + "\" style=\"color:#00376b\">" + hash + "</a>");
        }

        String[] userArray = Pattern.compile("@(\\w+)").matcher(text).results()
                .map(MatchResult::group)
                .toArray(String[]::new);

        for(String user : userArray) {
            text = text.replaceAll( user + "\\b", "<a href=\"/" + user.substring(1) + "\" style=\"color:#00376b\">" + user + "</a>");
        }

        text = text.replaceAll("\n", "</br>");

        return text;
    }
}
