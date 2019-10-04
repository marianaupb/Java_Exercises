import java.util.Scanner;

public class DescendingIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = scan.nextInt();
		
		for (int i = integer; i > 0; i--)	{
			System.out.print(i + " ");
		}

	}

}
