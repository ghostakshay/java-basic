package com.ghost.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

	
	public static void main(String[] args) throws ParseException {
		// 2022/11/
		String date = "2022-11-11 21:22:33";
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//dateFormat.setTimeZone(TimeZone.getDefault());
		Date parse = dateFormat.parse(date);
		System.out.println(parse);
		SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
		String format = formatTime.format(parse);
		System.out.println("Parse Date "+format);
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("Leap Year "+ calendar.isLeapYear(2016));
		
		LocalDate ldate = LocalDate.ofEpochDay(1222266L);
		System.out.println("Is Leap Year "+ldate.isLeapYear());
	}
}
