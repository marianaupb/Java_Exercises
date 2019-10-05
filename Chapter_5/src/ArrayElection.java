import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayElection {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int candidates = scan.nextInt();

		String[] name = new String[candidates];

		int[] votes = new int[candidates];

		for (int i = 0; i < candidates; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			name[i] = scan.next();

			System.out.print("Enter votes: ");
			votes[i] = scan.nextInt();
		}

		int max = maximum(votes);

		List<Integer> indexOfWinners = new ArrayList<Integer>();

		for (int i = 0; i < votes.length; i++) {
			if (votes[i] == max) {
				indexOfWinners.add(i);
			}
		}
		if (indexOfWinners.size() == 1) {
			System.out.println("The winner is " + name[indexOfWinners.get(0)] + " with " + max + " votes!");
		} else {
			System.out.println("The election is a tie between the following candidates: ");
			for (Integer index : indexOfWinners) {
				System.out.println(name[index] + " (" + max + " votes)");
			}
		}

	}

	public static int maximum(int[] scanArray) {
		int maxValue = scanArray[0];
		for (int i = 1; i < scanArray.length; i++) {
			if (scanArray[i] > maxValue) {
				maxValue = scanArray[i];
			}
		}
		return maxValue;
	}
}

