import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String word = scan.nextLine();

		int count = 0;
		

		if (word.equals("quit")) {
			System.out.print("The total length is 0.");
			return;
		}
		while (!word.equals("quit")) {
			count += word.length();
		
			System.out.print("ENter next string: ");
			word = scan.nextLine();
		}
		System.out.print("The total length is " + count);
	}

}
