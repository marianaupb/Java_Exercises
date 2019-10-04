import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalPlaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Enter a decimal number: ");
		double number = readDouble (scan);
		
		System.out.print(twoDecimals.format(number).replace('.', ','));
		
	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.nextLine().replace(',', '.'));
	}

}
