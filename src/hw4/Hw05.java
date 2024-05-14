package hw4;

import java.util.Scanner;

public class Hw05 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("請輸入年月日：");
			int year = input.nextInt();
			int month = input.nextInt();
			int day = input.nextInt();

			if (isValidDate(year, month, day)) {
				int dayOfYear = calculateDayOfYear(year, month, day);
				System.out.println("輸入的日期為該年第" + dayOfYear + "天");
			} else {
				System.out.println("輸入的日期無效");
			}

			input.close();
		}

		// 判斷日期是否合法
		public static boolean isValidDate(int year, int month, int day) {
			if (month < 1 || month > 12) {
				return false;
			}
			if (day < 1) {
				return false;
			}
			int maxDays = 31;
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				maxDays = 30;
			} else if (month == 2) {
				maxDays = isLeapYear(year) ? 29 : 28;
			}
			return day <= maxDays;
		}

		// 判斷是否為閏年
		public static boolean isLeapYear(int year) {
			return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		}

		// 計算該日期是該年的第幾天
		public static int calculateDayOfYear(int year, int month, int day) {
			int dayOfYear = day;
			for (int i = 1; i < month; i++) {
				if (i == 2) {
					dayOfYear += isLeapYear(year) ? 29 : 28;
				} else if (i == 4 || i == 6 || i == 9 || i == 11) {
					dayOfYear += 30;
				} else {
					dayOfYear += 31;
				}
			}
			return dayOfYear;
		}
	}
