import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExVowelsOnly {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Finnish vowels = A,E,I,O,U,Ä,Ö,Y

		System.out.print("Enter a string: ");
		String vowel = scan.nextLine();

		Pattern pat = Pattern.compile("A|E|I|O|U|Ä|Ö|Y");
		Matcher mat = pat.matcher(vowel.toUpperCase());

		if (mat.groupCount() == vowel.length()) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels");
		}

	}

}
