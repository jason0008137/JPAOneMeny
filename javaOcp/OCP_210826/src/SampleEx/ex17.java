package SampleEx;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class ex17 {

	public static void main(String[] args) throws InterruptedException {

		// Login time:2015-01-12T21:58:18.817z
		Instant loginTime = Instant.now();
		Thread.sleep(1000);
		System.out.println(loginTime);
		// Logout time:2015-01-12T21:58:19.880Z
		Instant logoutTime = Instant.now();
		System.out.println(loginTime);
		System.out.println(logoutTime);

		loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES); // line n1
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(loginTime);
		System.out.println(logoutTime);

		System.out.println(logoutTime.isAfter(loginTime));

		if (logoutTime.isAfter(loginTime))
			System.out.println("Logged out at: " + logoutTime);
		else
			System.out.println("Can't logout");

//		A) Logged out at: 2015-01-12T21:58:00Z
//
//		B) Logged out at: 2015-01-12T21:58:19.880Z
//
//		C) Can't logout
//
//		D) A compilation error occurs at line n1
	}

}
