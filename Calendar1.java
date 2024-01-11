public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
		int sundayCount= 0;
	    String s = "Sunday";
	 	while (dayOfMonth<=31&&month<=12&&year<=1999) {
	 			
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (dayOfMonth==1&&month==1&&year==2000) { 

	 			break;
	 		}   if (dayOfWeek==1&&dayOfMonth==1){
				sundayCount++;
			}
			if (dayOfWeek==1){ 
				System.out.println(dayOfMonth+"/"+month+"/"+year + " " + s);
				
			} 
			else System.out.println(dayOfMonth+"/"+month+"/"+year);
        } System.out.println("During the 20th century, " + sundayCount + " Sundays fell on the first day of the month");
	 	
	 }
	
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
	
		dayOfMonth++;
		dayOfWeek++;
		if (dayOfMonth>nDaysInMonth(month, year)){
			month++;
			dayOfMonth = 1;
		}
		if (month > 12) {
			year++;
			month = 1;
		}
		if (dayOfWeek>7){
			dayOfWeek= 1;
		}
		
		} 
	 
		 
    // Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    
		if (year%4==0){
			return true;
		} else {

			return false;
		}

		
	}
	 
	// Returns the number of days in the given month and year.
	public static int nDaysInMonth(int month, int year) {
		if (isLeapYear(year) && month ==2){

          return 29;

		} if (!isLeapYear(year) && month == 2){

			return 28;

		} if (month == 1 || month==3|| month==5 || month == 7|| month == 8|| month==10||month==12){

			return 31;

		} else {

			return 30;
		}
		
	}
}
