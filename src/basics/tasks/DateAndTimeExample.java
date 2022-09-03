package basics.tasks;

import java.time.*;

public class DateAndTimeExample {
    public static void main(String[] args) {
        //LocalTime
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is: " + localTime);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute() + "/" + localTime.getSecond());
        System.out.printf("/%d/%d/%d\n", localTime.getHour(), localTime.getMinute(), localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withNano(0).withSecond(0);
        System.out.println(localTime1);

        //Increase localTime1 by 15 minutes
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until: " + localTime1);
        System.out.println();

        //LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate);
        System.out.println("Year is " + localDate.getYear());
        System.out.println("Day of the week: " + localDate.getDayOfWeek());
        System.out.println("Day of the year: " + localDate.getDayOfYear());
        System.out.println("Week of the year: " + (localDate.getDayOfYear() / 7+1));

        LocalDate localDate1 = localDate.of(2019, Month.DECEMBER, 11);
        System.out.println("First case of Covid19 date was: " + localDate1);
        System.out.println();
        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time now: " + localDateTime);
        System.out.println();

        //International Cat's day
        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(1997,Month.NOVEMBER,20,10,45,25,0);
        System.out.println("First International Cat's day is on: " + firstInternationalCatsDay);
        System.out.println(firstInternationalCatsDay.getMonth() + ", " + firstInternationalCatsDay.getDayOfMonth());
        System.out.println(firstInternationalCatsDay.getMonth().getValue() + "." + firstInternationalCatsDay.getDayOfMonth());
        System.out.println();

        //Duration
        System.out.println(Duration.ofHours(2).toMinutes()); //converts hours to minutes
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());
        System.out.println("Duration from todays' date and first International Cat's day is: " + Duration.between(firstInternationalCatsDay, LocalDateTime.now()).toDays());
        System.out.println();

        //Period, we will use LocalDate object (for months and years)
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(160)).getMonths());

    }
}
