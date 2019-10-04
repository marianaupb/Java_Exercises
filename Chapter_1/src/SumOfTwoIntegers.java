import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter first integer: ");
		int first = scan.nextInt();
		
		System.out.print("Enter second integer: ");
		int second = scan.nextInt();
		
		int result = first + second;
		
		System.out.print(first + " + " + second + " = " + result);
		
	}

}
