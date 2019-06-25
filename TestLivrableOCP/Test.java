import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author samirromdhani
 */
public class Test {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		// System.out.println("Today's date is: " + today); // Today's date is:
		// 2019-06-25

		LocalTime currTime = LocalTime.now();
		// System.out.println("Current time is: " + currTime); // Current time is:
		// 11:17:41.374

		// Similar to LocalDate and LocalTimethe methods, LocalDateTime has methods such
		// as now(), of(), and parse()
		LocalDateTime currDateTime = LocalDateTime.now();
		// System.out.println("Today's date and current time is: " + currDateTime); //
		// Today's date and current time is: 2019-06-25T11:29:51.373

		// ################# Period #####################
		// The java.time.Period class is used to measure an amount of time in terms of
		// years, months, and days
		LocalDate manufacturingDate = LocalDate.of(2016, Month.JANUARY, 1);
		LocalDate expiryDate = LocalDate.of(2018, Month.JULY, 18);
		Period expiry = Period.between(manufacturingDate, expiryDate);
		// System.out.printf("Medicine will expire in: %d years, %d months, and %d days
		// (%s)\n", expiry.getYears(), expiry.getMonths(), expiry.getDays(), expiry);
		// ################# Duration #####################
		// The Duration class represents time in terms of hours, minutes, seconds, and
		// so on.
		
		System.out.println("My zone id is: " + ZoneId.systemDefault());
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		ZoneId myZone = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDate, currentTime,
		myZone);
		System.out.println(zonedDateTime);
	}
}
