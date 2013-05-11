import java.io.File;
import java.util.Scanner;


public class lowercase {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		}
		catch (Exception e) {
			System.err.println("Invalid file input");
		}
		while (inputScanner.hasNextLine()) {
			System.out.println(inputScanner.nextLine().toLowerCase());
		}
	}
}
