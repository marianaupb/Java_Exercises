import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scan.nextInt();

		int result = MethodsLibrary.factorial(number);

		System.out.print(number + "! = " + result);
	}

}
