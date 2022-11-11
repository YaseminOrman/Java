package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01Review {
    public static void main(String[] args) {
        //How to get current date
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);

        //how to get current time
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDate currentDateInJapan=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);

        LocalTime currentTimeInJapan=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);

        LocalDateTime currentDateTimeInJapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        LocalDate cd1=LocalDate.now();
        LocalDate cd1Next=cd1.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(cd1Next);

       LocalDate cd1Past= cd1.minusYears(3).minusMonths(3).minusDays(5);
        System.out.println(cd1Past);

        //HOMEWORK  Type code to learn how to go future and past in time

        LocalTime ct1=LocalTime.now();
       LocalTime ct1Next= ct1.plusHours(2).plusMinutes(20).plusSeconds(120);
        System.out.println(ct1Next);

        LocalTime ct1Past=ct1.minusHours(5).minusMinutes(30).minusSeconds(80);
        System.out.println(ct1Past);

        //specific part of the time
        LocalTime ct2 =LocalTime.now();
        int hour=ct2.getHour();
        System.out.println(hour);

        int minute =ct2.getMinute();
        System.out.println(minute);

        int nano =ct2.getNano();
        System.out.println(nano);

        //How to change the format
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedCurrentDate=dtf.format(cd1);
        System.out.println(formattedCurrentDate);

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MMMM/yy");
        String formattedCurrentDate2=dt.format(cd1);
        System.out.println(formattedCurrentDate2);

        DateTimeFormatter mnr=DateTimeFormatter.ofPattern("HH:mm a");
         String formattedTime=mnr.format(ct1);
        System.out.println(formattedTime);

        //How to create specific a=dates
        LocalDate dob1=LocalDate.of(2014,1,14);
        LocalDate dob2=LocalDate.of(2016, Month.SEPTEMBER,28);

        //How to compare two dates
        Boolean isBefore =dob1.isBefore(dob2);
        System.out.println(isBefore);

        Boolean is =dob2.isBefore(dob1);
        System.out.println(is);

        boolean isAfter=dob2.isAfter(dob1);
        System.out.println(isAfter);












    }
}
