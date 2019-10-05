import java.util.Scanner;

public class MethodsPrimes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many primes: ");
		int primes = scan.nextInt();

		int count = 1;
		int i = 2;

		while (count <= primes) {
			if (isPrime(i)) {
				count++;
				System.out.print(i + " ");
			}
			i++;
		}

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
