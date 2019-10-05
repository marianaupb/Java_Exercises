import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] english = {"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"};
		
		String[] finn = {"lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja"};
		
		System.out.print("Enter an English word: ");
		String englishInput = scan.nextLine();
		
		for (int i = 0; i < english.length; i++)	{
			if (englishInput.equals(english[i]))	{
				System.out.print(finn[i]);
				return;
			} 
		}
		System.out.print("Unknow word!");
	}

}
