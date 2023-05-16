package com.ghost.DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeTest {

	public static void main(String[] args) {

		// Print Date
		LocalDate date = LocalDate.now();
		System.out.println(date);

		// Print Time
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// Print dd,mm,yyyy
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(dd + ".." + mm + ".." + yyyy);
		// Print in formate dd-mm-yyyy
		System.out.printf("%d-%d-%d", dd, mm, yyyy);

		// Print hour,minutes,second,nanosecond
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nano = time.getNano();
		// print in format h:m:s:n
		System.out.println();
		System.out.printf("%d:%d:%d:%d", hour, minute, second, nano);

		// Get Particular date
		LocalDateTime birthdate = LocalDateTime.of(1990,Month.MARCH, 25, 9, 50);
		System.out.println();
		System.out.println(birthdate);

		// Get Date After 6 months
		System.out.println("6 Months AFter date" + birthdate.plusMonths(6));

		// Get Date Before 6 months
		System.out.println("6 Months Before date" + birthdate.minusMonths(6));

	}

}
