import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Entera string: ");
		String text = scan.nextLine();
		
		String finalText = reverse(text);
		System.out.print(finalText);
	}

	private static String reverse(String text) {
		String count = "";
		for (int i = text.length() - 1; i >= 0; i--)	{
			count += text.charAt(i);
		}
		return count;
	}

}
