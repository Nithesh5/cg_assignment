package cg_assignment;

public class Problem1 {

	// reverse the string
	public static char[] stringReverse(char inputArray[]) {

		try {
			for (int i = 0, j = inputArray.length - 1; i < inputArray.length / 2; i++, j--) {
				char temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
			}
			return inputArray;
		} catch (Exception e) {
			System.out.println("Exception Occured: ");
			e.printStackTrace();
		}
		return inputArray;
	}

	// check given constraints
	public static boolean checkConstraints(char inputArray[]) {

		final int min_range = 1, max_range = 100000;

		try {

			if (min_range <= inputArray.length && inputArray.length <= max_range) {

				for (int i = 0; i < inputArray.length; i++) {

					int val = (int) inputArray[i];
					if (!(32 < val && val < 126)) { // check for ASCII values
						System.out.println("Second constarint failed ie., 's[i] is a printable ascii character'");
						return false;
					}
				}
				return true;
			} else {
				System.out.println("First constarint failed ie., '1 <= s.length <= 10^5'");
			}

		} catch (Exception e) {
			System.out.println("Exception Occured: ");
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {

		char[] inputArray = { 'h', 'e', 'l', 'l', 'o' };

		if (checkConstraints(inputArray)) {
			inputArray = stringReverse(inputArray);
		}

		// Print output
		for (char i : inputArray) {
			System.out.print(i + " ");
		}
	}
}
