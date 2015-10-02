import java.util.Scanner;

public class Factorial {
	public static void main (String [] args) {
            int j = 1;
            for (j=0; j <= 3; j++) {
               Scanner in = new Scanner(System.in);
		int x = 0, y;
		System.out.println("enter Factorial number:");
		if (in.hasNextInt()) {	// if in has the next integer
			x = in.nextInt();
		}
		y = Factorial(x);
		System.out.println("Factorial is " + y); 
            } // end for		
	} // end main

	public static int Factorial(int n) {
                if (n == 0 || n == 1) {  // non-recursive, stop condition
                    return 1;
                }
                else return n * Factorial(n-1); 
	} // end Factorial
} // end class