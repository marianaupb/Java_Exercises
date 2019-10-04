import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String grade = null;

		while (grade == null) {
			System.out.print("Enter grade (0-5): ");

			try {
				grade = scan.next();
				int gradeInt = Integer.parseInt(grade);

				if (gradeInt >= 0 && gradeInt <= 5) {
					System.out.print("OK");

				} else {
					System.out.println(grade + " is not a valid grade");
					grade = null;

				}

			} catch (NumberFormatException nfe) {
				System.out.println(grade + " is not a valid grade");
				grade = null;
			}

		}

	}
}
