package strms;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateEx {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();// present date 2022-01-21
        System.out.println(localDate);
        LocalDate ld1 = LocalDate.of(2020,02,21);//2020-02-21
        System.out.println("ld1 : "+ld1);
        LocalDate ld2 = LocalDate.ofYearDay(2022,124);// date of 124th day in 2022
        System.out.println("ld2 : "+ld2);//2022-05-04

        // Get Values from localdate

        System.out.println(ld2.getMonth());// MAY
        System.out.println(ld2.getMonthValue());// 5
        System.out.println(ld2.getDayOfMonth());// 4
        System.out.println(ld2.getDayOfWeek());// WEDNESDAY
        System.out.println(ld2.get(ChronoField.DAY_OF_MONTH));// 4

        // Modifying Local Date
        // All localdate objects are immutable
        System.out.println(ld2.plusDays(2));
        System.out.println(ld2.plusYears(2));
        System.out.println(ld2.plusMonths(3));

        System.out.println(ld2.withYear(2011));// year of date is changed
        System.out.println(ld2.with(ChronoField.YEAR,2011));
        System.out.println(ld2.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println(ld2.isEqual(ld1));// false
        System.out.println(ld1.isLeapYear());// true

    }

}
