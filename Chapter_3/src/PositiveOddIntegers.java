import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String oddNumber = "";
		int number = 0;

		while (!oddNumber.equals("quit")) {
			try {
				System.out.print("Enter a positive odd integer: ");
				oddNumber = scan.nextLine();

				if (oddNumber.equals("quit")) {
					break;
				}
				number = Integer.parseInt(oddNumber);
				
				if (number % 2 != 0 && number > 0) {
					System.out.println("OK");
				} else {
					System.out.println(number + " is not a positive odd integer");
				}
			} catch (NumberFormatException nfe) {
				System.out.println(oddNumber + " is not a positive odd integer");
			}
		}
		System.out.println("Bye!");
	}
}