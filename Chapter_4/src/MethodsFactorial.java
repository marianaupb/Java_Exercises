import java.util.Scanner;

public class MethodsFactorial {

	public static void main(String[] args) {

		int number = 1;
		for (int i = 1; i <= 9; i++) {
			factorial(9);
			number *= i;
			System.out.println(i + "! = " + number);
		}
	}

	private static void factorial(int i) {
	}

}
