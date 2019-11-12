import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an English word: ");
		String word = scan.nextLine();

		WordPair[] wordsArray = new WordPair[5];

		wordsArray[0] = new WordPair("bird", "lintu");
		wordsArray[1] = new WordPair("bus", "bussi");
		wordsArray[2] = new WordPair("car", "auto");
		wordsArray[3] = new WordPair("cat", "kissa");
		wordsArray[4] = new WordPair("dog", "koira");

		for (int i = 0; i < wordsArray.length; i++) {
			if (word.equals(wordsArray[i].getEnglishWord())) {
				System.out.print(wordsArray[i].getFinnishWord());
				return;
			}
		}
		System.out.print("Unknow word!");
	}

}
