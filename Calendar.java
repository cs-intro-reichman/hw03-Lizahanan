public class Calendar {
    	
        
        static int dayOfMonth = 1;   
        static int month = 1;
        static int year = 1900;
        static int dayOfWeek = 2;     
        static int nDaysInMonth = 31; 
        
        
        public static void main(String args[]) {
		
        int IsYear = Integer.parseInt(args[0]);
	    
	    String s = "Sunday";
		
		
	 	year = IsYear;
		
		
		while (month <= 12 && year==IsYear){
			
			
			
			  if ( dayOfWeek==1){
				System.out.println(dayOfMonth+"/"+month+"/"+year + " " + s);
			} else {
				System.out.println(dayOfMonth+"/"+month+"/"+year);
            } 
              advance();
		}
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
	public static int nDaysInMonth(int month, int IsYear) {
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
