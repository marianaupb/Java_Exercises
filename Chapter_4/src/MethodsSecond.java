import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = scan.nextInt();

		System.out.print("Enter height: ");
		int height = scan.nextInt();

		printRectangle(width, height);
	}
	private static void printRectangle(int width, int height) {
		String count = "";

		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				count += "x";
			}
			count += System.lineSeparator();
		}
		System.out.print(count);
	}
}
