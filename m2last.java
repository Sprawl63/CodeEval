import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class m2last {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		while (inputScanner.hasNextLine()) {
			String input = inputScanner.nextLine();
			String[] output = input.split(" ");
			if (Integer.parseInt(output[output.length - 1]) <= output.length - 1) {
				System.out.println(output[output.length - Integer.parseInt(output[output.length - 1]) - 1]);
			}
		}
	}
}
