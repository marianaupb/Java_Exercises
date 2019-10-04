import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter original price: ");
		double price = readDouble(scan);

		System.out.print("Enter discount percentage: ");
		double discount = readDouble(scan);

		double result = (price) - ((price) * (discount / 100));

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("The final price is " + twoDecimals.format(result).replace(".", ","));

	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.nextLine().replace(",", "."));
	}

}
