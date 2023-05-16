package com.ghost.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {
		
		LocalDate birthdate = LocalDate.of(1990, 03, 25);
		System.out.println(birthdate);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		Period p = Period.between(birthdate, today);
		
		System.out.printf(" %d year %d months %d days",
							 p.getYears(),p.getMonths(),p.getDays());
		
		System.out.println();
		//Get Months from Birthdate to today
		int months = p.getYears()*12+p.getMonths();
		int days = p.getYears()*365+p.getMonths()*30+p.getDays();
		System.out.println("Total Month Difference :"+months);
		System.out.println("Total Days Difference :"+days);
	}
}
