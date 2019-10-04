import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateSecond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try	{
		System.out.print("Enter grade (0-5): ");
		int grade = scan.nextInt();
		
		if (grade >= 0 && grade <= 5)	{
			System.out.print("OK");
		} else	{
			System.out.print("Please, enter an integer between 0-5");
		}
		} catch (InputMismatchException ime)	{
			System.out.print("Please, enter an integer between 0-5");
		}
	}

}
