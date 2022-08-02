package basiccorejavaprogram;


import java.util.Scanner;
	
public class OddEven {
		
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
			 
			System.out.print("Enter a number: ");

			int num = sc.nextInt(); // nextInt() method is used and store the value in num variable

			if (num % 2 == 0)
			{ // using % operator and check if it is divisible by 2 or not.
			    System.out.println(num + " is even number");
			} 
			else
			{
				System.out.println(num + " is odd number");
			}
	}
}