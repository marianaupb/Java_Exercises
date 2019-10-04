import java.text.DecimalFormat;
import java.util.Scanner;

public class AgentCommission {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter selling price: ");
		double price = readDouble(scan);

		double comission = (price * 0.0344);

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		if (comission <= 2400) {
			System.out.print("The commission is 2400,00 euros.");
		} else {
			System.out.print("The commission is " + twoDecimals.format(comission).replace(".", ",") + " euros.");
		}

	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

}
