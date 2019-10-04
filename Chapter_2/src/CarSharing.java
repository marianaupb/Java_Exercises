import java.text.DecimalFormat;
import java.util.Scanner;

public class CarSharing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter driven kilometers: ");
		int kilometers = scan.nextInt();

		System.out.print("Enter fuel consumption per 100 km: ");
		double consumption = readDouble(scan);

		System.out.print("Enter fuel price per liter: ");
		double fuel = readDouble(scan);

		System.out.print("Enter number of people: ");
		int people = scan.nextInt();

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		double result = (((consumption / 100) * kilometers) * fuel) / people;

		System.out.print(
				"Each of the " + people + " should pay " + twoDecimals.format(result).replace(".", ",") + " euros.");

	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

}
