import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter first string: ");
		String first = scan.nextLine();
		
		System.out.print("Enter second string: ");
		String second = scan.nextLine();
		
		if (first.toLowerCase().equals(second.toLowerCase()))	{
			System.out.print("Equal");
		} else	{
			System.out.print("Not equal");
		}
	}

}
