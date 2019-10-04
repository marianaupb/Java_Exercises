import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter price for a single ticket: ");
		double singleTicket = readDouble(scan);

		System.out.print("Enter price for a season ticket: ");
		double seasonTicket = readDouble(scan);

		System.out.print("Enter the number of bus trips per month: ");
		int monthlyTrips = scan.nextInt();

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		double result = singleTicket * monthlyTrips;

		if (result < seasonTicket) {
			double total = seasonTicket - result;
			System.out.print(
					"Buying a single ticket is " + twoDecimals.format(total).replace(".", ",") + " euros cheaper");
		} else if (result == seasonTicket) {
			System.out.print("There is no difference");
		} else {
			double totalSecond = result - seasonTicket;
			System.out.print("Buying a season ticket is " + twoDecimals.format(totalSecond).replace(".", ",")
					+ " euros cheaper");

		}

	}

	private static double readDouble(Scanner scan) {

		return Double.parseDouble(scan.next().replace(',', '.'));
	}

}
