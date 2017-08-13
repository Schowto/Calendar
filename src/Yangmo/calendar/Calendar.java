package Yangmo.calendar;

public class Calendar {

	private static final int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] leapdays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int weekCheck(String weekday) {
		String[] weekdays = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };
		int a = 0;
		for (int i = 0; i <= 6; i++) {
			if (weekday.equals(weekdays[i])) {
				a = i;
			}
		}
		return a;
	}

	public int returnmax(int year, int month) {
		if (isLeapyear(year)) {
			return leapdays[month - 1];
		} else {
			return days[month - 1];
		}
	}

	public boolean isLeapyear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public void printSample(int year, int month, String weekday) {
		System.out.printf("  <<%4d년 %3d월>>   \n", year, month);
		System.out.println("SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		int maxday = returnmax(year, month);

		for (int o = 1; o <= weekCheck(weekday); o++) {
			System.out.print("   ");
			if (o == 7) {
				System.out.println();
			}
		}
		for (int i = 1; i <= maxday; i++) {
			System.out.printf("%2d ", i);
			if (i % 7 == (7 - weekCheck(weekday))) {
				System.out.println();
			} else if (i == maxday) {
				System.out.println();
			}
		}
	}
}
