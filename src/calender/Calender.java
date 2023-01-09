package calender;
import java.util.Arrays;
import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] MAX_DAYS_YUN = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int year, int month) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return MAX_DAYS_YUN[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	public String getStartWeekday(int year, int month) {
		// 기준일 : 1583.1.1.토
		String[] weekdays = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
		int sum = 0;
		
		for (int i = 1583; i < year; i++) {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				sum += 2;
			} else {
				sum += 1;
			}
		}
		
		for (int j = 1; j < month; j++) {
			sum += getMaxDaysOfMonth(year, j) % 7;
		}
		
		String weekday = weekdays[(6 + sum) % 7]; // 기준일이 토요일이기 때문에 토요일에 더해줌
		return weekday;
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
		for (int i = 1; i <= cal.getMaxDaysOfMonth(year, month); i++) {
			if (i < 10) {
				System.out.printf(" %d ", i);
			} else {
				System.out.printf("%d ", i);
			}
			if ((i + index) % 7 == 0) {
				System.out.print("\n");
			}
			
		}
		System.out.print("\n");
	}
}
