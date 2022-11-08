package com.learn.oop.date;

import java.time.LocalDate;

public class DateExample {
	public static void main(String[] args) {
		LocalDate todaysDate=LocalDate.now();
		LocalDate yesterdayDate=todaysDate.minusDays(1);
		LocalDate tomorrowDate=todaysDate.plusDays(1);
		
		System.out.println("today:"+todaysDate);
		System.out.println("yesterday:"+yesterdayDate);
		System.out.println("tomorrow:"+tomorrowDate);
	}

}
