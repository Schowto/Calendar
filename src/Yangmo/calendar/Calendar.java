package Yangmo.calendar;

public class Calendar {
	public int returnmax(int month) {
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return days[month - 1];
	}

	public void printSample(int year, int month) {
		Calendar c = new Calendar();

		System.out.printf("  <<%4d년 %3d월>>   \n", year, month);
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		if(month !=2) {
		for (int i = 29; i <= c.returnmax(month); i++) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		}
	}
}
