package com.bookstore.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DataPractice {

	public static void main(String[] args) throws ParseException {
		// how to create date object
		// Date date=new Date(year, month, date)

		// how to take date from the user and convert to util.Date
		// String dateString=null;
		// Scanner scanner=new Scanner(System.in);
		// dateString=scanner.nextLine();
		// SimpleDateFormat formate=new SimpleDateFormat("dd/MM/yyyy");
		// Date date=formate.parse(dateString);
		//
		// System.out.println(date);
		//
		// //in order to support jdbc : we need to cover util.date to sql.date
		// //date.getTime(): java.util.Date.getTime() metod give me millsec since mid
		// night 1970
		//
		// java.sql.Date dateSql=new java.sql.Date(date.getTime());
		//
		// java8 date and time api

		LocalDate localDate = LocalDate.of(2019, Month.AUGUST, 24);

		// System.out.println(localDate);

		// gettting current date
		// LocalDate localDate2=LocalDate.now();
		// System.out.println(localDate2);

		// How to convert String to localDate

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");

		String dateString = "16/08/2016";
		LocalDate dateTemp = LocalDate.parse(dateString, fmt);
		System.out.println(dateTemp);

		
		//how to convert localDate to sql.Date
		java.sql.Date dateSql=java.sql.Date.valueOf(dateTemp);
		
		
		//https://www.topjavatutorial.com/java-8/convert-java-8-localdate-java-sql-date-vice-versa/
		
		
		
	}

}
