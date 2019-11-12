import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = scan.nextLine();

		System.out.print("Enter surname: ");
		String surname = scan.nextLine();

		String username = createUsername(firstName, surname);

		if (surname.length() < 3 && firstName.length() < 2) {
			System.out.print("Not enough letters to create a username!");
			return;
		} else {
			System.out.print(username);
		}

	}

	private static String createUsername(String firstName, String surname) {
		String sur = "";
		String fir = "";
		String username = "";
		
		if (firstName.isEmpty() || surname.isEmpty() || surname.length() < 3 || firstName.length() < 2) {
			return null;
		} else {
			sur = surname.substring(0, 3).toLowerCase();
			fir = firstName.substring(0, 2).toLowerCase();
			username = sur + fir;
		}
		return username;

	}

}
