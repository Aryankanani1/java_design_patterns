package Java8Features.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

        // Format the current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted current date and time: " + formattedDateTime);

        // Parse a string to a date
        String dateString = "25-06-2024";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Parsed date: " + parsedDate);

        // Get the current time in a specific timezone
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current date and time in New York: " + currentZonedDateTime);

        // Calculate the period between two dates
        LocalDate startDate = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2024, Month.JUNE, 25);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between " + startDate + " and " + endDate + ": " + period.getYears() + " years, " +
                period.getMonths() + " months, " + period.getDays() + " days");

        // Calculate the duration between two times
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(17, 45);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration between " + startTime + " and " + endTime + ": " + duration.toHours() + " hours, " +
                duration.toMinutesPart() + " minutes");

        // Get the current date and time in UTC
        Instant now = Instant.now();
        System.out.println("Current date and time in UTC: " + now);

       // Output:
//        Current date: 2024-06-25
//        Current time: 00:19:35.462724300
//        Current date and time: 2024-06-25T00:19:35.463725700
//        Formatted current date and time: 25-06-2024 00:19:35
//        Parsed date: 2024-06-25
//        Current date and time in New York: 2024-06-24T14:49:35.483723400-04:00[America/New_York]
//        Period between 2020-01-01 and 2024-06-25: 4 years, 5 months, 24 days
//        Duration between 09:30 and 17:45: 8 hours, 15 minutes
//        Current date and time in UTC: 2024-06-24T18:49:35.537725800Z
    }
}