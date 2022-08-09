//Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//heads
//c. O/P -> Percentage of Head vs Tails

package basiccorejavaprogram;
import java.util.Scanner; // import scanner class

public class FlipCoin {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in); // create object
		System.out.println("Enter number ");
		int toss = ab.nextInt(); // using nextInt() method
		int Heads = 0, Tails = 0;
		for (int i = 0; i < toss; i++) {
			double flipcoin = Math.random();// using random method for random no
			System.out.println(flipcoin);
			if (flipcoin < 0.5) {
				Heads++;
				System.out.println("Heads");
			} else {
				Tails++;
				System.out.println("Tails");
			}
		}
		int Head = (Heads * 100) / toss;
		int Tail = (Tails * 100) / toss;
		System.out.println("Percentage Head:" + Head);
		System.out.println("Percentage Tail:" + Tail);
    }
}
