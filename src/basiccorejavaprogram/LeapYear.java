//Leap Year
//a. I/P -> Year, ensure it is a 4 digit number.
//b. Logic -> Determine if it is a Leap Year.
//c. O/P -> Print the year is a Leap Year or not.

package basiccorejavaprogram;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args){
        int year;
        System.out.println("Enter Year");
        Scanner ab = new Scanner(System.in); // create object
        year = ab.nextInt();// nextInt() method used
        if (year >0 && year < 9999) {
        	if (((year%4 == 0) && (year%100!= 0)) || (year%400 == 0)) {
        		System.out.println("It is a leap year");
        		}
        		else
        		System.out.println("It is not a leap year");
        }
        else 
        	System.out.println("please enter four digit num year");
        }
}