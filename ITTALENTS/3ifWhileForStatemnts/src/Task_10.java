public class Task_10 {

	public static void main(String[] args) {
		int day = 28;
		int month = 2;
		int year = 2009;

		int daysInMonth = 31;

		boolean leap = ((((year % 100 != 0) && year % 4 == 0)) || (year % 400 == 0));

		day += 1;

		switch (month) {
		case (2):
			if (leap) {
				daysInMonth = 29;
			} else {
				daysInMonth = 28;
			}
			break;
		case (4):

		case (6):

		case (9):

		case (11):
			daysInMonth = 30;
			break;
		}

		if (daysInMonth < day) {
			day = 1;
			month++;
			if (month > 12) {
				month = 1;
				year++;
			}
		}

		System.out.println(day + " " + month + " " + year + " ");

	}

}
