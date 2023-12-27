/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int a = Integer.parseInt(args[0]);
		boolean check = true;
		for (int i = 0; i < a; i++) {
			check = true;
			for (int j = 0; j < a; j++) {
				if (i % 2 == 1 && check) {

					if (j == 0)
						System.out.print(" * ");
					else if (j != (a - 1)) {
						System.out.print("* ");
					} else {
						System.out.print("*");
					}
					check = false;
				} else {

					System.out.print("* ");
				}
			}
			System.out.println();

		}
	}
}
