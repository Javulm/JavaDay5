package BasicCoreJavaProgram;
import java.util.Scanner;  // import scanner class

public class FlipCoin {

    public static void main(String[] Args) {

        Scanner ab = new Scanner(System.in);  // create object

        System.out.println("Enter number ");

        int toss = ab.nextInt();  // using nextInt() method

        int Heads=0 , Tails=0 ;

        // using for loop

        for (int i=0; i<toss; i++) {

            double flipcoin = Math.random();// using random method for random no

            if (flipcoin < 0.5) {
                Heads++;
                System.out.println("Heads");
            }
            else {
                Tails++;
                System.out.println("Tails");

            }
        }
        int Head = (Heads*100)/toss;
        int Tail = (Tails*100)/toss;
        System.out.println("Percentage Head:" +Head);
        System.out.println("Percentage Tail:" +Tail);
    }
}
