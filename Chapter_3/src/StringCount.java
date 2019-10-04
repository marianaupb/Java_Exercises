import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String words = scan.nextLine();
		int count = 0;
		String total = null;

		if (words.equals("")) {
			System.out.print("Add some input!");
			return;
		}
		while (!words.equals("")) {
			total += words;
			count++;

			System.out.print("Enter the next string: ");
			words = scan.nextLine();
		}
		System.out.print("The total of string are " + count);

	}

}
