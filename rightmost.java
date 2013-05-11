import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class rightmost {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		while (inputScanner.hasNextLine()) {
			String input = inputScanner.nextLine();
			String longString = input.split(",")[0];
			String character = input.split(",")[1];
			int output = -1;
			for (int x = 0; x < longString.length(); x++) {
				if (x != longString.length() - 1) {
					if (longString.substring(x,x+1).equals(character)) {
						output = x;
					}
				}
				else {
					if (longString.substring(x).equals(character)) {
						output = x;
					}
				}
			}
			System.out.println(output);
		}
	}
}
