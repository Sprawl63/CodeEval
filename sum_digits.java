import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sum_digits {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		String line;
		int sum;
		while (inputScanner.hasNextLine()) {
			line = inputScanner.nextLine();
			sum = 0;
			for (int x = 0; x < line.length(); x++) {
				sum += Integer.parseInt((x == line.length() - 1)? line.substring(x) : line.substring(x,x+1));
			}
			System.out.println(sum);
		}
	}
}
