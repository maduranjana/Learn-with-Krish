package soapApp;

public class CalculateToBday {
	
	public int getDay(int year, int month, int day) {
		
		return Calculate.calculateDays(year, month, day);
	}

}
