import java.util.Scanner;

public class StringDecimalPartLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a decimal number: ");
		String number = scan.nextLine();
		
		String[] trueNumber = number.replace(".", ",").split(",");
		
		if (trueNumber[0].length() == 0)	{
			System.out.print("Please enter a proper decimal number");
		} else	{
			System.out.println(trueNumber[1].length() + " decimal place(s)");
		}
		

	}


}
