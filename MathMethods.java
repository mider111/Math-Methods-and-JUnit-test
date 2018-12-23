
public class MathMethods {

	// Takes a number as a parameter; if this number is negative,
	// subtracts the doubled value of the number from itself to 
	// make it positive
	public static int abs(int number) {

		if (number < 0)
			return number - 2 * number;
		
		else
			return number;
		
	}

	// Takes 2 numbers as parameters, prints the larger one
	public static int max(int number1, int number2) {
		
		if (number1 >= number2)
			return number1;
		
		else
			return number2;
		
	}

	// Takes 2 numbers as parameters: the base and the exponent.
	// Calculates the number by multiplying the base with itself exponent times 
	public static double pow(double base, int exponent) {
		
		double number = base;
		
		// If the base is not 0, calculates values according to 
		// the sign of the exponent
		if (base != 0) {
		
			if (exponent > 0) {
			
				for (int i = 0; i < exponent - 1; i++) {
					number *= base;
				} 
				
				return number;
				
			} else if (exponent == 0) {
				
				return 1.0;
				
			} else {
				
				for (int i = 0; i > exponent + 1; i--) {
					number *= base;
				}
				
				return 1.0 / number;
				
			}

		} 
		
		// If the base is 0, returns infinity
		else
			return Double.POSITIVE_INFINITY;

	}

	// Takes 2 numbers as parameters, prints the smaller one
	public static int min(int number1, int number2) {
		
		if (number1 <= number2)
			return number1;
		
		else
			return number2;
		
	}
	
}