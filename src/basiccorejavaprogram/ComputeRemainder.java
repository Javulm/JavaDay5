//Java Program to Compute Quotient and Remainder

package basiccorejavaprogram;

public class ComputeRemainder {

	    public static void main(String[] args) {

	        int dividend = 30, divisor = 5; //we have created two variables dividend and divisor

	        int quotient = dividend / divisor; // we have used the / operator We have divided dividend (25) by divisor (4). Since both dividend and divisor are integers, the result will also be integer.

	        int remainder = dividend % divisor; //find the remainder we use the % operator. Here, the dividend is divided by the divisor and the remainder is returned by the % operator.



	        System.out.println("Quotient = " + quotient);//30 / 5 results 6, output will be 6

	        System.out.println("Remainder = " + remainder);//30 % 5  results 0
	    }
}
