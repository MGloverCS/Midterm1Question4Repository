package midtermQuestionFourPackage;

class midtermQuestionFour {
	public static void main(String[] args) {
		// Calls employee class for display.
		new employee("Matthew Glover", "A9999", "Boss", "Managerial", "1500", "9");
		new employee("Some Dude", "B2222", "Salaryman", "Accounts", "50", "40");
		new employee("Joe Schmoe", "Z1111", "Janitor", "Janitorial", "15", "50");
		
		}
		
	}
 // New employee class takes information given in main and displays it.
class employee {
	public String name;
	public String idNumber;
	public String title;
	public String department;
	public String hourlyRates;
	public String hoursPerWeek;
	public String[] infoList;
	
	// Method "employee" sets values and prints them.
	public employee(String argName, String argIdNumber, String argTitle, String argDepartment, String argHourlyRates, String argHoursPerWeek) {
		name = argName;
		idNumber = argIdNumber;
		title = argTitle;
		department = argDepartment;
		hourlyRates = argHourlyRates;
		hoursPerWeek = argHoursPerWeek;
		
		
		System.out.println("Name : " + name);
		System.out.println("ID Number : " + idNumber);
		System.out.println("Title : " + title);
		System.out.println("Department : " + department);
		System.out.println("Hourly Rates : $" + hourlyRates);
		System.out.println("Hours per week : " + hoursPerWeek + "\n");
	}

	
	}
	