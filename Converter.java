/**
 * This class is a template for the Converter object. The constructor takes in a String and used that to create a StringBuilder that has numerical digits replaced
 * with text representations of those digits.
 *
 * @author Matthew Bavis
 * @version March 29, 2017
 */
public class Converter {
	private String original; // Holds the String sent in from the Driver
	private StringBuilder converted; // Holds the converted form of the String

	/**
	 * The default constructor of the Converter class. It sets both fields to null.
	 */
	public Converter() {
		original = null;
		converted = null;
	}

	/**
	 * An overloaded constructor for the Converter class. Sets the original field to the String parameter and calls the method convert() to assign the converted field.
	 * @param sentenceIn - Sentence sent in from the main method in the driver.
	 */
	public Converter(String sentenceIn) {
		original = sentenceIn;
		converted = convert();
	}

	/**
	 * Get method that returns the value of the StringBuilder field converted
	 * @return converted - StringBuilder that has digits replaced with text
	 */
	public StringBuilder getConverted() {
		return converted;
	}

	/**
	 * Converts the digits in a StringBuilder to text representations of the digits.
	 * @return numbers - StringBuilder that has digits replaced
	 */
	public StringBuilder convert() {
		StringBuilder numbers = new StringBuilder(original); // Creates a new StringBuilder using the original field

		for (int i = 0; i < numbers.length(); i++) { // For loop that moves through the indexes of the StringBuilder
			if (i == 0) { // If the first index of the StringBuilder
				if(Character.isDigit(numbers.charAt(i)) && Character.isDigit(numbers.charAt(i+1))) { // Does nothing if there are two consecutive digits
					continue;
				} else { // replaces each digit with its spelling, starting with a capital letter
					switch (numbers.charAt(i)) {
					case '0':
						numbers.replace(i,i+1,"Zero");
						break;
					case '1':
						numbers.replace(i,i+1,"One");
						break;
					case '2':
						numbers.replace(i,i+1,"Two");
						break;
					case '3':
						numbers.replace(i,i+1,"Three");
						break;
					case '4':
						numbers.replace(i,i+1,"Four");
						break;
					case '5':
						numbers.replace(i,i+1,"Five");
						break;
					case '6':
						numbers.replace(i,i+1,"Six");
						break;
					case '7':
						numbers.replace(i,i+1,"Seven");
						break;
					case '8':
						numbers.replace(i,i+1,"Eight");
						break;
					case '9':
						numbers.replace(i,i+1,"Nine");
						break;
					}
				}
			} else if (i == numbers.length() - 1) { // If the last index of the StringBuilder
				if (Character.isDigit(numbers.charAt(i)) && Character.isDigit(numbers.charAt(i-1))) { // Does nothing if there are two consecutive digits
					continue;
				} else { // Replaces the digit with its spelling
					switch (numbers.charAt(i)) {
					case '0':
						numbers.replace(i,i+1,"zero");
						break;
					case '1':
						numbers.replace(i,i+1,"one");
						break;
					case '2':
						numbers.replace(i,i+1,"two");
						break;
					case '3':
						numbers.replace(i,i+1,"three");
						break;
					case '4':
						numbers.replace(i,i+1,"four");
						break;
					case '5':
						numbers.replace(i,i+1,"five");
						break;
					case '6':
						numbers.replace(i,i+1,"six");
						break;
					case '7':
						numbers.replace(i,i+1,"seven");
						break;
					case '8':
						numbers.replace(i,i+1,"eight");
						break;
					case '9':
						numbers.replace(i,i+1,"nine");
						break;
					}
				}
			} else { // If neither the first nor last index
				if ((Character.isDigit(numbers.charAt(i)) && Character.isDigit(numbers.charAt(i+1))) || (Character.isDigit(numbers.charAt(i)) && Character.isDigit(numbers.charAt(i-1)))) { // if there are two consecutive digits
					continue;
				} else { // replaces the digits with its text representation
					switch (numbers.charAt(i)) {
					case '0':
						numbers.replace(i,i+1,"zero");
						break;
					case '1':
						numbers.replace(i,i+1,"one");
						break;
					case '2':
						numbers.replace(i,i+1,"two");
						break;
					case '3':
						numbers.replace(i,i+1,"three");
						break;
					case '4':
						numbers.replace(i,i+1,"four");
						break;
					case '5':
						numbers.replace(i,i+1,"five");
						break;
					case '6':
						numbers.replace(i,i+1,"six");
						break;
					case '7':
						numbers.replace(i,i+1,"seven");
						break;
					case '8':
						numbers.replace(i,i+1,"eight");
						break;
					case '9':
						numbers.replace(i,i+1,"nine");
						break;
					}
				}
			}
		}
		return numbers; // returns the StringBuilder numbers
	}
}
