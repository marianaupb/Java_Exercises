class MethodsLibrary {

	public static int factorial(int a) {

		int number = 1;
		for (int i = 1; i <= a; i++) {
			number *= i;
		}
		return number;
	}

}
