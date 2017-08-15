package Yangmo.calendar;

import java.util.Scanner;

public class Prompt {

	public final String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		while (true) {
			System.out.println("년도을 입력하세요");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			int month = scanner.nextInt();
// 			그 달의 첫번째 요일을 입력 받아서 구현
//			System.out.println("첫번째 요일을 입력하세요.(SU, MO, WE, TH, FR, SA");
//			System.out.print("WEEKDAY> ");
//			String weekday = scanner.next();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}

			cal.printSample(year, month);
		}
		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		 Prompt p = new Prompt();
		 p.runPrompt();
		
		//실험용
//		Calendar c = new Calendar();
//		System.out.print(c.weekCheck("MO"));
	}

}
