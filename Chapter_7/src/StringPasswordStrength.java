import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a password: ");
		String password = scan.nextLine();

		boolean strength = checkStrength(password);

		if (strength) {
			System.out.print("OK");
		} else {
			System.out.print("Not strong enough");
		}

	}

	private static boolean checkStrength(String password) {
		int count = 0;
		
		if (password.length() < 8)	{
			return false;
		}
		if (password.matches("[\\w|\\W]*[A-Z][\\w|\\W]*")) {
			count++;
		}
		if (password.matches("[\\w|\\W]*[a-z][\\w|\\W]*")) {
			count++;
		}
		if (password.matches("[\\w|\\W]*[0-9][\\w|\\W]*")) {
			count++;
		}
		if (password.matches("[\\w|\\W]*[@#$%_*^~+][\\w|\\W]*")) {
			count++;
		}

		if (count < 3) {
			return false;
		} 
		return true;
	}

}
