import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class longestlines {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		LinkedList<String> input = new LinkedList<String>();
		int numResults = Integer.parseInt(inputScanner.nextLine());
		while (inputScanner.hasNextLine()) {
			input.add(inputScanner.nextLine());
		}
		while (numResults > 0) {
			int largest = 0;
			int largestIndex = 0;
			for (int x = 0; x < input.size(); x++) {
				if (input.get(x).length() > largest) {
					largestIndex = x;
					largest = input.get(x).length();
				}
			}
			System.out.println(input.get(largestIndex));
			input.remove(largestIndex);
			numResults--;
		}
	}
}
