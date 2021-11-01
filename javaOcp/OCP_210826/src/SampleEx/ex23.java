package SampleEx;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;

public class ex23 {
	public static void main(String[] args) {
		LocalTime now = LocalTime.of(6, 30);
		long timeToBreakfast = 0;

		LocalTime office_start = LocalTime.of(7, 30);
		if (office_start.isAfter(now)) {
			timeToBreakfast = now.until(office_start, MINUTES);
		} else {
			timeToBreakfast = now.until(office_start, HOURS);
		}

		System.out.println(timeToBreakfast);

	}
}
