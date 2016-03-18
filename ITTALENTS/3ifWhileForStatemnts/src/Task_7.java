

public class Task_7 {

	public static void main(String[] args) {

		int day = 20;

		int month = 3;

		int year = 2001;

		int days = 0;

		switch (month) {

		case (12):
			days += 30;

		case (11):
			days += 31;

		case (10):
			days += 30;

		case (9):
			days += 31;
		case (8):
			days += 31;
		case (7):
			days += 30;
		case (6):
			days += 31;
		case (5):
			days += 30;
		case (4):
			days += 31;
		case (3):
			days += 28;
		case (2):
			days += 31;
		case (1):
			days += day;
		}
		if (((month > 2) && ((year % 100 != 0) && year % 4 == 0))
				|| (year % 400 == 0)) {
			days += 1;
		}

		System.out.println(days);

	}

}
