import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] bloodBank = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.print("Enter blood type: ");
		String bloodType = scan.nextLine();

		double count = 0.0;

		for (int i = 0; i < bloodBank.length; i++) {
			if (bloodType.equals(bloodBank[i])) {
				count++;
			}
		}
		double total = count*10;
		
		DecimalFormat oneDecimals = new DecimalFormat("0.0");
		
		System.out.print(oneDecimals.format(total).replace('.',',') + " %");
	}

}
