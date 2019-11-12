import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scan.nextLine();

		int countLetters = 0, countNumbers = 0;

		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				countLetters++;
			} else if (Character.isDigit(text.charAt(i))) {
				countNumbers++;
			}
		}
		System.out.println(countLetters + " letter(s)");
		System.out.println(countNumbers + " digit(s)");

	}

}
