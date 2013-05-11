import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sameend {
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
			String shortString = input.split(",")[1];
			boolean contains = false;
			for (int x = 0; x < longString.length() - shortString.length() + 1; x++) {
				if (longString.substring(x).equals(shortString)) {
					contains = true;
					break;
				}
			}
			if (contains) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}
}
