/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		//// Put your code here
		int a = Integer.parseInt(args[0]);
		String str = "";
		int count = 0, sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				count++;
				sum += i;
			}
		}
		if (count > 0 && sum == a) {
			count = 0;
			str += a + " is a perfect number since " + a + " = ";
			for (int j = 1; j < a; j++) {
				if (a % j == 0) {
					if (j == 1)
						str += " " + j;
					else
						str += " + " + j;
					count++;

				}
			}
			System.out.println(str);
		}

		else
			System.out.println(a + " is not a perfect number");

	}
}
