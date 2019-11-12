import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = scan.nextLine();
		username.replace(username, username.toLowerCase());

		System.out.print("Enter password: ");
		String password = scan.nextLine();
		password.replace(password, password.toLowerCase());

		if (validatePassword(username, password) == true) {
			System.out.print("OK!");
		} else {
			System.out.print("NOT OK!");
		}
	}

	private static boolean validatePassword(String username, String password) {
		if (password.toLowerCase().length() >= 8 && !password.toLowerCase().contains(username.toLowerCase())) {
			return true;
		}
		return false;
	}
}
