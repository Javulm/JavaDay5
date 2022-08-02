//Factors
//a. Desc -> Computes the prime factorization of N using brute force.
//b. I/P -> Number to find the prime factors
//c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//d. O/P -> Print the prime factors of number N.

package basiccorejavaprogram;

import java.util.Scanner; // import scanner class

class PrimeFactor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create object

        System.out.println("Enter number");

        int n = sc.nextInt();

        System.out.println("Prime factors for the given numbers:");

        // using for loop

        for(int i=2;i<=n;i++)
        {
            // using while loop

            while(n%i==0)

            {
                n=n/i;

                System.out.println(i+"");
            }
        }

    }
}