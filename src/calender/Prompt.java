package calender;
import java.util.Scanner;

public class Prompt {
	private final static String PROMPT_YEAR = "YEAR> ";
	private final static String PROMPT_MONTH = "MONTH> ";
	private final static String PROMPT_WEEKDAY = "WE> ";
	
	public void runPrompt() {
		Calender cal = new Calender();
		Scanner scan = new Scanner(System.in);
		
		int month = 0;
		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.print(PROMPT_YEAR);
			int year = scan.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT_MONTH);
			month = scan.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day!");
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalender(year, month, cal.getStartWeekday(year, month));
		}
		scan.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
