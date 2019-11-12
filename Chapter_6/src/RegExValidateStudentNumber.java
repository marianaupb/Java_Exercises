import java.util.Scanner;

public class RegExValidateStudentNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String studentNumber = scan.next();

		if (studentNumber.matches("[0-9]{7}")) {
			System.out.print("OK");
		} else {
			System.out.print("Invalid student number");
		}

	}

}
