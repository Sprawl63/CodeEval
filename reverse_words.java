import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class reverse_words {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		while (inputScanner.hasNextLine()) {
			String[] outputLine = inputScanner.nextLine().split(" ");
			for (int x = outputLine.length; x > 0; x--) {
				System.out.print(outputLine[x-1]);
				if (x != 0) {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}