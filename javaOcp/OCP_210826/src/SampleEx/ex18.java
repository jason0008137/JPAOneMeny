package SampleEx;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ex18 {

	public static void main(String[] args) {
		ZonedDateTime dt = ZonedDateTime.of(
				LocalDate.of(2015, 3, 8),
				LocalTime.of(1, 0),
				ZoneId.of("America/New_York"));
		System.out.println(dt);
		ZonedDateTime dt2 = dt.plusHours(2);
		System.out.println(dt2);
		System.out.print(DateTimeFormatter.ofPattern("H:mm-").format(dt2));
		System.out.println("difference: " + ChronoUnit.HOURS.between(dt, dt2));
	}
}
