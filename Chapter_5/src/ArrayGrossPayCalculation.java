import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your hourly wage: ");
		double hourlyWage = readDouble(scan);

		System.out.print("Enter the number of days: ");
		int days = scan.nextInt();

		int[] hoursWorked = new int[days];
		int totalHours = 0;
		double payment = 0.00;

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		for (int i = 0; i < hoursWorked.length; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			hoursWorked[i] = scan.nextInt();

			totalHours += hoursWorked[i];

			if (hoursWorked[i] <= 8) {
				payment += hourlyWage * hoursWorked[i];
			} else {
				payment += 8 * hourlyWage;
				payment += hourlyWage * (hoursWorked[i] - 8) * 1.5;

			}

		}

		System.out.println("Total work hours is " + totalHours);
		System.out.println("Gross pay is " + twoDecimals.format(payment).replace(".", ","));
		System.out.print("You entered the following daily hours: ");

		for (int i = 0; i < hoursWorked.length; i++) {
			System.out.print(hoursWorked[i] + " ");
		}

	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

}
