import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Double[] numbers = new Double[4];
		
		System.out.print("Enter 1. number: ");
		numbers[0] = scan.nextDouble();
		
		System.out.print("Enter 2. number: ");
		numbers[1] = scan.nextDouble();
		
		System.out.print("Enter 3. number: ");
		numbers[2] = scan.nextDouble();
		
		System.out.print("Enter 4. number: ");
		numbers[3] = scan.nextDouble();
		
		Arrays.sort(numbers, Collections.reverseOrder());

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
