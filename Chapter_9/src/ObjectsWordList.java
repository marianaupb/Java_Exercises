import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsWordList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a word (quit ends): ");
		String word = scan.nextLine();

		ArrayList<String> wordsList = new ArrayList<String>();

		while (!word.equals("quit")) {
			wordsList.add(word);
			System.out.print("Enter a word (quit ends): ");
			word = scan.nextLine();
		}
		Collections.sort(wordsList);

		for (String wordObj : wordsList) {
			System.out.println(wordObj);
		}

	}

}
