/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int a = Integer.parseInt(args[0]);

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < a; j++) {
				if (i % 2 == 1) {

					if (j == 0)
						System.out.print(" * ");
					else if (j != (a - 2)) {
						System.out.print("* ");
					} else {
						System.out.print("*");
					}

				} else {

					System.out.print("* ");
				}
			}
			System.out.println();

		}
	}
}
