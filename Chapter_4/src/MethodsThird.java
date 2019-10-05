import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter gross salary: ");
		double grossSalary = readDouble(scan);

		System.out.print("Enter income tax rate: ");
		double taxRate = readDouble(scan);

		calculateNetSalary(grossSalary, taxRate);
	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

	private static void calculateNetSalary(double grossSalary, double taxRate) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		double netSalary = grossSalary - (grossSalary * (taxRate / 100));

		System.out.print("The net salary is " + twoDecimals.format(netSalary).replace(".", ","));
	}

}
