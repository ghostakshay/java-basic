package com.ghost.DateTimeAPI;

import java.time.Year;
import java.util.Scanner;

public class YearTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		//CHeck whether given year is leap year or not
		Year y = Year.of(year);
		if(y.isLeap()) {
			System.out.printf("%d is leap year",year);
		}else {
			System.out.printf("%d is not leap year",year);
		}
	}

}
