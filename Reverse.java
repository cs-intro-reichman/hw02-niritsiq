/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		//// Put your code here
		String s = (args[0]);
		int n = s.length();

		String newS = "";

		for (int i = n - 1; i >= 0; i--) {

			newS += s.charAt(i);

		}

		System.out.println(newS);
		System.out.println("The middle character is " + newS.charAt(n / 2));

	}
}
