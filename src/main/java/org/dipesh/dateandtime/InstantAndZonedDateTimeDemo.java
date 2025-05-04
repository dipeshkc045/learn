package org.dipesh.dateandtime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class InstantAndZonedDateTimeDemo {

    public static void main(String[] args) {

        // 1️⃣ Get current instant (UTC)
        Instant nowInstant = Instant.now();
        System.out.println("Current Instant (UTC): " + nowInstant);

        // 2️⃣ Convert Instant to ZonedDateTime in user's time zone (e.g., Asia/Kathmandu)
        ZoneId kathmanduZone = ZoneId.of("Asia/Kathmandu");
        System.out.println("Kathmandu Zone: " + kathmanduZone);
        ZonedDateTime kathmanduTime = nowInstant.atZone(kathmanduZone);
        System.out.println("Kathmandu Time: " + kathmanduTime);

        // 3️⃣ Format ZonedDateTime for display (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedKathmanduTime = kathmanduTime.format(formatter);
        System.out.println("Formatted Kathmandu Time: " + formattedKathmanduTime);

        // 4️⃣ Convert back to Instant (e.g., from user input in their local time)
        // Let's say user selects 2025-05-04 15:00:00 in their local time
        ZonedDateTime userSelectedTime = ZonedDateTime.of(
                2025, 5, 4, 15, 0, 0, 0, kathmanduZone
        );
        Instant convertedToInstant = userSelectedTime.toInstant();
        System.out.println("User selected Instant (UTC): " + convertedToInstant);
    }
}
