package soapApp;

public class Calculate {

	public static int calculateDays(int year, int month, int day) {

		int yearc = year;
		int monthc = month;
		int dayc = day;

		boolean isleap = isLeapYear(year);

		int daycount;

		if (isleap == true) {
			daycount = dayleap(month, day);
		} else {
			daycount = day(month, day);
		}

		return daycount;
	}

	private static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static int day(int month, int day) {

		switch (month) {
		case 1:
			return day;

		case 2:
			return 31 + day;

		case 3:
			return 31 + 28 + day;

		case 4:
			return 31 + 28 + 31 + day;

		case 5:
			return 31 + 28 + 31 + 30 + day;

		case 6:
			return 31 + 28 + 31 + 30 + 31 + day;
		case 7:
			return 31 + 28 + 31 + 30 + 31 + 30 + day;
		case 8:
			return 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		case 9:
			return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		case 10:
			return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		case 11:
			return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		case 12:
			return 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;

		}

		return 0;
	}

	private static int dayleap(int month, int day) {

		switch (month) {
		case 1:
			return day;

		case 2:
			return 31 + day;

		case 3:
			return 31 + 29 + day;

		case 4:
			return 31 + 29 + 31 + day;

		case 5:
			return 31 + 29 + 31 + 30 + day;

		case 6:
			return 31 + 29 + 31 + 30 + 31 + day;
		case 7:
			return 31 + 29 + 31 + 30 + 31 + 30 + day;
		case 8:
			return 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
		case 9:
			return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		case 10:
			return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		case 11:
			return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		case 12:
			return 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;

		}

		return 0;
	}
}
