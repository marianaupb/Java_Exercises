import java.util.Scanner;

public class RegExValidateSize {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		String size = scan.nextLine();

		if (size.toUpperCase().matches("[X]S") || size.toUpperCase().matches("[X]L")
				|| size.toUpperCase().matches("[SML]")) {
			System.out.print("OK!");
		} else {
			System.out.print("Invalid size");
		}
	}
}

//ARRAY *best way to solve it*

// String[] size = { "XS", "S", "M", "L", "XL" };
// System.out.print("Enter size: ");
// String sizeInput = scan.nextLine();
// for (int i = 0; i < size.length; i++) {
// if (sizeInput.toUpperCase().equals(size[i])) {
// System.out.print("OK");
// return;
// }
// }
// System.out.print("Invalid size");

// REGEX//