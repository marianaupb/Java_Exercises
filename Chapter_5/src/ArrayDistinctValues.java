import java.util.Arrays;
import java.util.Scanner;

public class ArrayDistinctValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of values: ");
		int value = scan.nextInt();

		int[] numbers = new int[value];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter an integer: ");
			numbers[i] = scan.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			Arrays.sort(numbers);
			while (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
				i++;
			}
			System.out.print(numbers[i] + " ");
		}
	}

}
