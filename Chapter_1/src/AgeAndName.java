import java.util.Scanner;

public class AgeAndName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		
		System.out.print("Enter your name: ");
		String name = scan.next();
		
		System.out.print(name + ", " + age + " years");
	}

}
