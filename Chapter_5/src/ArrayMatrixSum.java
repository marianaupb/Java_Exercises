
public class ArrayMatrixSum {

	public static void main(String[] args) {
	    int[][] first = { { 1, 2, 0 }, { 2, 3, 4 } };
	    int[][] second = { { 3, 2, 5 }, { 6, 4, 3 } };
	    int[][] third = { { 1, 1, 1, 1 }, { 4, 3, 2, 1 }, { 2, 2, 2, 2 } };
	    int[][] fourth = { { 2, 2, 2, 3 }, { 2, 3, 2, 0 }, { 1, 2, 3, 4 } };

	    printSum(first, second);
	    System.out.println();

	    printSum(third, fourth);
	}

	private static void printSum(int[][] first, int[][] second) {
		int sum [][] = new int[first.length][first[0].length];
		
		for (int i = 0; i < first.length; i++)	{
			for (int o = 0; o < first[i].length; o++)	{
				sum[i][o] = first[i][o] + second[i][o];
				System.out.print(sum[i][o] + " ");
			}
			System.out.println();
		}
	}
}
