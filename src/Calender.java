import java.util.Arrays;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Calender cal = new Calender();

		System.out.println(num + "월은 " + cal.getMaxDaysOfMonth(num) + "일까지 있습니다.");
		
	}
}
