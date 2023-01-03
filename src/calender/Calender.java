package calender;
import java.util.Arrays;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public void printCalender(int year, int month, String weekday) {
		Calender cal = new Calender();
		String[] weekdays = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
		int index = Arrays.asList(weekdays).indexOf(weekday);
		
		System.out.printf("%4d년%3d월 \n", year, month);
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		for (int i = 0; i < index; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= cal.getMaxDaysOfMonth(month); i++) {
			if (i < 10) {
				System.out.printf(" %d ", i);
			} else {
				System.out.printf("%d ", i);
			}
			if (i % 7 == index + 1) {
				System.out.print("\n");
			}
			
		}
		System.out.print("\n");
	}
}
