import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String first = scan.nextLine();

		System.out.print("Enter second string: ");
		String second = scan.nextLine();

		boolean decision = isAnagram(first, second);

		if (decision) {
			System.out.print("Anagram");
		} else {
			System.out.print("Not anagram");
		}

	}

	private static boolean isAnagram(String first, String second) {
		if (first.length() <= 0 || second.length() <= 0) {
			return false;
		}
		return true;
	}

}
