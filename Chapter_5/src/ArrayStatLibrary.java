
public class ArrayStatLibrary {

	static double standardDeviation(int[] arrayNumbers) {
		double deviation = 0.00;
		double mean = mean(arrayNumbers);
		for (int i = 0; i < arrayNumbers.length; i++) {
			deviation += (((arrayNumbers[i] - mean) * (arrayNumbers[i] - mean)) / (arrayNumbers.length - 1));
		}
		return (Math.sqrt(deviation));
	}

	static double median(int[] arrayNumbers) {
		double median = 0.00;
		for (int i = 0; i < arrayNumbers.length; i++) {
			if (arrayNumbers.length % 2 == 0) {
				median = ((arrayNumbers.length / 2) + (arrayNumbers.length / 2 - 1)) / 2;
			} else {
				median = arrayNumbers.length / 2;
			}
		}
		return median;
	}

	static double mean(int[] arrayNumbers) {
		double count = 0.00;
		for (int i = 0; i < arrayNumbers.length; i++) {
			count += arrayNumbers[i];
		}
		double mean = (count / arrayNumbers.length);
		return mean;
	}

	static int min(int[] arrayNumbers) {
		int minimum = arrayNumbers[0];
		for (int i = 0; i < arrayNumbers.length; i++) {
			if (arrayNumbers[i] < minimum) {
				minimum = arrayNumbers[i];
			}
		}
		return minimum;
	}

	static int max(int[] arrayNumbers) {
		int maximum = arrayNumbers[0];
		for (int i = 0; i < arrayNumbers.length; i++) {
			if (arrayNumbers[i] > maximum) {
				maximum = arrayNumbers[i];
			}
		}
		return maximum;
	}

}
