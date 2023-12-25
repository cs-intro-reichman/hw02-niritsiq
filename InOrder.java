/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main(String[] args) {
		//// Write your code here
		int x = (int) (Math.random() * 10.0);
		int last = x;
		while (x >= last) {
			last = x;
			x = (int) (Math.random() * 10.0);
			if (x <= last) {
				System.out.println(last);
				x = -1;
			} else
				System.out.println(last);
		}
	}
}
