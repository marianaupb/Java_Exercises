import java.text.DecimalFormat;
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter driven kilometers: ");
		int kilometers = scan.nextInt();
		
		System.out.print("Enter amount of fuel consumed: ");
		double fuel = readDouble(scan);
		
		System.out.print("Enter fuel price per liter: ");
		double price = readDouble(scan);
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		double result = ((fuel /kilometers) * price);
		
		System.out.print("The cost per kilometer is " + twoDecimals.format(result).replace(".", ",") + " euros.");

	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

}
