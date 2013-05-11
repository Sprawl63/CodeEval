import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class num_of_ones {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		while (inputScanner.hasNextLine()) {
			System.out.println(Integer.toBinaryString(Integer.parseInt(inputScanner.nextLine())).replace("0","").length());
		}
	}
}
