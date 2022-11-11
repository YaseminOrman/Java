package day18datetimeclassvarargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01Review2 {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);

        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);

        LocalDate cd1=LocalDate.now();
        System.out.println(cd1);

        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(cd1Next);

        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);

        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedCurrentDate=dtf.format(cd1);

    }
}
