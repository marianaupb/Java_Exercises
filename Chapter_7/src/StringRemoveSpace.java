import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String text = scan.nextLine();

		String textWithoutSpace = removeExtraSpace(text);

		System.out.print(("\"" + textWithoutSpace + "\"").trim());

	}

	private static String removeExtraSpace(String text) {
		String textWithoutSpace = text.replaceAll("\\s+", " ");
		return textWithoutSpace;
	}

}
