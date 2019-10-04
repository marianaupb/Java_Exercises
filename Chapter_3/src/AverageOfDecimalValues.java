import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number (zero ends): ");
		double number = readDouble(scan);
		double total = 0.0;
		int count = 0;
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		if (number == 0.0) {
			System.out.print("Nothing to calculate!");
			return;
		}
		while (number != 0) {
			total += number;
			count++;
			System.out.print("Enter next number (zero ends): ");
			number = readDouble(scan);
		}
		
		double avg = total / count;
		System.out.print("The average is " + twoDecimals.format(avg).replace(".", ","));
	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

}
