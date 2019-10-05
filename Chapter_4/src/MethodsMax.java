import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first double: ");
		double first = readDouble(scan);

		System.out.print("Enter second double: ");
		double second = readDouble(scan);

		double maximum = max(first, second);
		System.out.print("The max value is " + maximum);

	}

	private static Double max(double first, double second) {
		double maximum = Math.max(first, second);
		return maximum;
	}

	private static double readDouble(Scanner scan) {
		return Double.parseDouble(scan.next().replace(",", "."));
	}

}
