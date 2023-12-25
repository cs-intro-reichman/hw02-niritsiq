/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main(String[] args) {
		//// Put your code here
		int sum2 = 0, sum3 = 0, sum4 = 0;
		double avg;
		int t = Integer.parseInt(args[0]);
		for (int i = 0; i < t; i++) {
			// OneOfEach
			boolean girl = false, boy = false;
			int count = 0;
			while (!girl || !boy) {
				// bigger than 0.5 mean girl
				if (Math.random() > 0.5) {
					girl = true;
					// System.out.print("g ");
				} else {
					boy = true;
					// System.out.print("b ");
				}

				count++;
			}
			if (count == 2)
				sum2++;
			else if (count == 3)
				sum3++;
			else
				sum4++;
			// part of OneOfEach System.out.println();
			// part of OneOfEach System.out.println("You made it... and you now have " +
			// count + " children");

		}
		int common;
		common = Math.max(sum2, Math.max(sum3, sum4));
		avg = (double) ((double) ((sum2 * 2) + (sum3 * 3) + (sum4 * 4)) / t);
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + sum2);
		System.out.println("Number of families with 3 children: " + sum3);
		System.out.println("Number of families with 4 or more children: " + sum4);
		System.out.println("The most common number of children is " + common + " or more.");
	}
}
