import java.util.Scanner;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = scan.next();

		if (username.matches("a\\d{7}@myy\\.haaga-helia\\.fi")) { 
			//or (username.matches("a[0-9]{7}@myy\\.haaga-helia\\.fi"))
			System.out.print("OK!");
		} else {
			System.out.print("Invalid username format");
		}
	}

}
