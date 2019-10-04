import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter dividend: ");
		int dividend = scan.nextInt();

		System.out.print("Enter divisor: ");
		int divisor = scan.nextInt();

		int result = dividend / divisor;

		int remainder = dividend % divisor;

		System.out.print(dividend + " / " + divisor + " = " + result + ", the remainder is " + remainder);

	}

}
