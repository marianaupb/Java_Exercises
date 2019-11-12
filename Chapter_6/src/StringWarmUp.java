import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scan.nextLine();

		System.out.println(text.length() + " characters");
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());

	}

}
