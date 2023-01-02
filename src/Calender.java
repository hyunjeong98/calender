import java.util.Arrays;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public static void main(String[] args) {
		String PROMPT="cal> ";
		Calender cal = new Calender();
		Scanner scan = new Scanner(System.in);
		
		int month = 0;
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scan.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day!");
				break;
			}
			if (month > 12) {
				continue;
			}
			System.out.println(month + "월은 " + cal.getMaxDaysOfMonth(month) + "일까지 있습니다.");
		}
		
		
		scan.close();
	}
}
