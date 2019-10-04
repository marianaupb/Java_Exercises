import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Enter a non-negative integer: ");
			int integer = scan.nextInt();

			int count = 1;

			if (integer < 0) {
				System.out.print("Please enter a non-negative integer.");
				return;
			}
			for (int i = 1; i <= integer; i++) {
		
				count *= i;
			}
			System.out.print(integer + "! = " + count);

		} catch (InputMismatchException ime) {
			System.out.print("Please enter a non-negative integer.");
		}

	}
}