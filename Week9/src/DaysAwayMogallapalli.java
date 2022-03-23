import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Sabarish Mogallapalli - smogallapalli 
 * CIS171 27114 
 * Mar 22, 2022
 */

public class DaysAwayMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//do exception handling for month and date
		System.out.println("Enter the month of your birthday (i.e. 1,2,3...,12): ");
		int monthInput = in.nextInt();
		if(1 <= monthInput && monthInput <= 12) {
			System.out.println("Enter the date of your birthday (i.e. 1,2,3...,28): ");
			int dateInput = in.nextInt();
			if(1 <= dateInput && dateInput <= 31) {
		        LocalDate currentBirthday = LocalDate.of(2022, monthInput, dateInput);
		        int nextBirthday = birthdayCalculator(currentBirthday);
		        System.out.print("Your next birthday is in: " + nextBirthday + " days.");
			}
			else {
				System.out.println("Invalid input.");
			}
		}
		else {
			System.out.println("Invalid input.");
		}
		in.close();
	}
	
	public static int birthdayCalculator (LocalDate thisBirthday) {
		LocalDate currentDate = LocalDate.now();
		LocalDate nextBirthday = thisBirthday.plusYears(1);
        int daysTill = (int)ChronoUnit.DAYS.between(currentDate, nextBirthday);
        if (daysTill > 365) {
        	daysTill = daysTill - 365;
        }
        return daysTill;
	}


}
