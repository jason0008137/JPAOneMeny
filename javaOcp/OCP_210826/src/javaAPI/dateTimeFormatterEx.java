package javaAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class dateTimeFormatterEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.format(
				DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(now.format(
				DateTimeFormatter.ISO_ORDINAL_DATE));
		System.out.println(now.format(
				DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(now.format(
				DateTimeFormatter.ofPattern("a,B,EEEE,MMM,B,dd,hh:m")));
		System.out.println(now.format(
				DateTimeFormatter.ofPattern("西元yyyy MMMM dd hh點 m分 ss秒")));
		System.out.println(now.format(
				DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println(now.format(
				DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println(now.format(
				DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println(now.format(
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

	}

}
