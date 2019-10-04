import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateFirst {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Enter grade (0-5): ");
			int grade = scan.nextInt();

			if (grade > 5 || grade < 0) {
				System.out.print("Please, insert a valid integer");
			} else {
				System.out.print("OK");
			}
		} catch (InputMismatchException ime) {
			System.out.print("Please, insert a valid integer");

		}

	}
}
