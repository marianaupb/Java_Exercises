import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner scanName = new Scanner(System.in);
		Scanner scanPoints = new Scanner(System.in);
		
		Applicant[] applicantArray = new Applicant[4];
	
		for (int i = 0; i < 4; i++)	{
			System.out.print("Enter " + (i+1) + ". name: ");
			String name = scanName.nextLine();
			System.out.print("Enter points: ");
			int points = scanPoints.nextInt();
			
			applicantArray[i] = new Applicant(name, points);
		}
		
		System.out.print("Enter the minimum of required points: ");
		int minimumPoints = scanPoints.nextInt();
		
		System.out.println("The following applicants achived the minimum of " + minimumPoints + " points: ");
		
		for (int i = 0; i < applicantArray.length; i++)	{
			if (applicantArray[i].getPoints() >= minimumPoints)	{
				System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints() + " points");
			}
		}
	}

}
