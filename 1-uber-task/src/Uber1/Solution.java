
package Uber1;

import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
	public static java.io.InputStream input = System.in;
	public static java.io.PrintStream output = System.out;

	public static void log (final Object msg) {
		output.println(msg);
	}

	public static void main (final String[] args) {
		final Scanner in = new Scanner(input);
		final PrintStream out = output;

		final int a = in.nextInt();
		final int b = in.nextInt();
		final int sum = solveMeFirst(a, b);

		out.println(sum);
	}

	static int solveMeFirst (final int a, final int b) {
		return a + b;
	}

	public void run (final String[] args) {
		main(args);
	}

}
