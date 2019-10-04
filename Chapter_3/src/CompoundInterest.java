import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter initial deposit: ");
		double deposit = readDouble(scan);

		System.out.print("Enter interest rate: ");
		double rate = readDouble(scan);

		System.out.print("Enter capital income tax rate: ");
		double incomeTax = readDouble(scan);

		System.out.print("Enter number of years: ");
		int years = scan.nextInt();

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		for (int i = 1; i <= years; i++) {

			double resultFirst = deposit * (rate / 100);
			double resultSecond = resultFirst * (incomeTax/ 100);
			double total = resultFirst - resultSecond;

			deposit += total;

			System.out.println(i + ": " + twoDecimals.format(deposit).replace(".", ","));
		}
	}
	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

}
