import java.util.Arrays;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public static void main(String[] args) {
		Calender cal = new Calender();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반복횟수를 입력하세요.");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("월을 입력하세요.");
			int month = scan.nextInt();
			System.out.println(month + "월은 " + cal.getMaxDaysOfMonth(month) + "일까지 있습니다.");
		}

		scan.close();
	}
}
