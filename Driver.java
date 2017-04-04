/**
 * Driver for the Converter class.
 *
 * @author Matthew Bavis
 * @version March 29, 2017
 */
import java.util.*;
import java.io.*;
public class Driver {
	public static void main(String[] args) throws IOException {
		Scanner userInput = new Scanner(System.in); // Scanner used for user input
		Scanner fileReader; // Scanner to later be used in reading a file
		PrintWriter output; // PrintWriter to be used to write data to a file
		Converter[] sentences = new Converter[8]; // Array of Converter objects to be used for the sentences
		String filePath; // String used to hold the user file path

		System.out.print("Enter the file path for your input text file: "); // Prompts the user to enter a file path
		filePath = userInput.nextLine(); // Stores the user's file path into the String filePath
		fileReader = new Scanner(new File(filePath)); // Reads the user specified text file into fileReader

		System.out.print("Enter the file path for your output text file: "); // Prompts the user to enter a file path
		filePath = userInput.nextLine(); // Stores the user's file path into the String filePath
		output = new PrintWriter(filePath); // Creates a new PrintWriter that writes to the user specified file

		for (int i = 0; i < 8; i++) { // For loop that populates the sentences array with Converter projects
			sentences[i] = new Converter(fileReader.nextLine());
		}

		for (int j = 0; j < 8; j++) {
			System.out.println(sentences[j].getConverted()); // Prints the sentence at that index to the user
			output.println(sentences[j].getConverted()); // Prints the sentence at that index to a file
		}

		userInput.close(); // Closes userInput
		fileReader.close(); // Closes fileReader
		output.close(); // Closes output
	}
}
