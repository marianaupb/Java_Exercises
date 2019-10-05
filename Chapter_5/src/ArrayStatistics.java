import java.util.Scanner;

public class ArrayStatistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int values = scan.nextInt();

		if (values < 3) {
			System.out.print("Sorry, at least 3 values required");
			return;
		}
		int count = 0;
		int[] arrayNumbers = new int[values];

		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.print("Enter an integer: ");
			arrayNumbers[i] = scan.nextInt();
			count++;
		}

		System.out.println("n = " + count);
		ArrayStatLibrary(arrayNumbers);

	}

	private static void ArrayStatLibrary(int[] arrayNumbers) {
		System.out.println("Min: " + ArrayStatLibrary.min(arrayNumbers));
		System.out.println("Max: " + ArrayStatLibrary.max(arrayNumbers));
		System.out.println("Median: " + ArrayStatLibrary.median(arrayNumbers));
		System.out.println("Mean: " + ArrayStatLibrary.mean(arrayNumbers));
		System.out.println("Sample standard deviation: " + ArrayStatLibrary.standardDeviation(arrayNumbers));
		System.out.print("Sample standard deviation: ");

		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.print(arrayNumbers[i] + " ");
		}

	}

}
