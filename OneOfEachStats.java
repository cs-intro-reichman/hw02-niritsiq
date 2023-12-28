import java.util.Random;

/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get two command-line arguments: an int value
 * that determines how many families to simulate, and an int value
 * that serves as the seed of the random numbers generated by the program.
 * Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main(String[] args) {
		// Gets the two command-line arguments
		int T;
		T = Integer.parseInt(args[0]);
		int seed;
		seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
		Random generator = new Random(seed);

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		int sum2 = 0, sum3 = 0, sum4 = 0;
		double avg, bigger = 0.0;
		double rnd = generator.nextDouble();
		// i replace the use of t by T
		// int t = Integer.parseInt(args[0]);
		for (int i = 0; i < T; i++) {
			// OneOfEach
			boolean girl = false, boy = false;
			int count = 0;
			while (!girl || !boy) {
				// bigger than 0.5 mean girl
				if (generator.nextDouble() > 0.5) {
					girl = true;
					// part of the previous ex System.out.print("g ");
				} else {
					boy = true;
					// part of the previous ex System.out.print("b ");
				}

				count++; // number of the children in one family
			}
			if (count == 2)
				sum2++;
			else if (count == 3)
				sum3++;
			else if (count >= 4) {
				sum4++;
				bigger = bigger + count;
			}
			// part of OneOfEach System.out.println();
			// part of OneOfEach System.out.println("You made it... and you now have " +
			// count + " children");

		}
		int common;
		common = Math.max(sum2, Math.max(sum3, sum4));
		double children;
		children = (((double) (sum2 * 2) + (sum3 * 3)) + (bigger));
		avg = (children / T);
		// avg = ((double) ((double) (sum2 * 2) + (sum3 * 3) + (bigger)) / T);
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + sum2);
		System.out.println("Number of families with 3 children: " + sum3);
		System.out.println("Number of families with 4 or more children: " + sum4);
		if (sum4 == common)
			System.out.println("The most common number of children is " + common + " or more.");
		else if (sum3 == common)
			System.out.println("The most common number of children is 3.");
		else if (sum2 == common)
			System.out.println("The most common number of children is 2.");

	}
}
