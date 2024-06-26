package java_8_exmp.dateApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateApiDemo {
    public static void main(String[] args) {
        //Before java 1.8 we have two date packages it creates confusion.
        java.sql.Date sqlDate = new java.sql.Date(1);
        java.util.Date utilDate = new java.util.Date();

        System.out.println("sql date : " + sqlDate);
        System.out.println("util date : " + utilDate);

        //WE can't convert from one date to another package date.

        //even if we want only date the util date class will give us date + time.

        //Java 8 overcome those issues and added a new package called java.time.* and it contains Date API classes.
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println("LocalDate : " + localDate);
        System.out.println("localTime : " + localTime);
        System.out.println("instant : " + instant);

        for(String str : ZoneId.getAvailableZoneIds()) {
            System.out.println(" " + str);
        }

        // to print specific timezone information
//        LocalTime asiaTime = LocalTime.of(ZoneId.of("Asia/Tokyo"));
//        System.out.println("asiaTime :"+asiaTime);


    }
}
