package dateAndTime;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateAndTime {
	public static void main(String[] args) {
		// System.out.println(LocalDateTime.now());
		// Calendar cal = Calendar.getInstance();
		//
		// cal.add(Calendar.DATE, 3);
		// cal.add(Calendar.MONTH, -1);
		// cal.add(Calendar.YEAR, -1);
		//
		//
		// System.out.println(cal.get(Calendar.YEAR));
		// System.out.println(cal.get(Calendar.MONTH));
		// System.out.println(cal.get(Calendar.DATE));
		//
		// System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		// System.out.println(cal.get(Calendar.DAY_OF_YEAR));

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);

		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonth().getValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfWeek().getValue());

		Period fiveDays = Period.ofDays(5);
		Period fiveMonths = Period.ofMonths(5);

		LocalDate newDate= date.plus(fiveMonths);
		newDate = date.minus(fiveDays);
		System.out.println("Compare date to new "+newDate.compareTo(date));

		Duration fiveMin = Duration.ofMinutes(5);
		Duration fiveHours = Duration.ofHours(5);

		time = time.plus(fiveHours);
		time = time.minus(fiveMin);
		System.out.println(time);

		dateTime = dateTime.plus(fiveHours);
		dateTime = dateTime.plus(fiveDays);
		System.out.println(dateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yy");
		//to string
		String text = date.format(formatter);
		System.out.println(text);
		//to object again
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println(parsedDate);

	}

}
