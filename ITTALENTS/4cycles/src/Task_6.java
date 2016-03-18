public class Task_6 {

	public static void main(String[] args) {
		int day = 12;
		int month = 3;
		int year = 1987;

		int day1 = 17;
		int month1 = 7;
		int year1 = 1987;

		int counter = 0;

		while ((day1 > day) || (month1 > month) || (year1 > year)) {
			int daysInMonth = 31;

			boolean leap = ((((year % 100 != 0) && year % 4 == 0)) || (year % 400 == 0));

			day += 1;
			counter++;
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

		}

		System.out.println(day + " " + month + " " + year + " ");
		System.out.println("The difference is " + counter + " days");
	}

}
