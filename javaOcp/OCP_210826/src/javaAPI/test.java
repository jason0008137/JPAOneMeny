package javaAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		Date d = new Date();
		Date d2 = new Date(120, 9, 6);
		LocalDateTime dt = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.of(2021, 9, 6, 12, 20);

		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d2);
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getDayOfWeek());
		System.out.println(dt);
		System.out.println(dt.plusDays(5));
		System.out.println(dt.plusMonths(5));
		System.out.println(dt);
		System.out.println(dt2);
		
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
	
		
	}

}
