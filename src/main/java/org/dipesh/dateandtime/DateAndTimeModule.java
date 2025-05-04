package org.dipesh.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeModule {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time: " + localTime);
    }
}
