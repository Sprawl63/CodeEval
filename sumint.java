import java.io.File;
import java.util.Scanner;

public class sumint {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		}
		catch (Exception e) {
			System.err.println("Invalid file input");
		}
		int count = 0;
		while (inputScanner.hasNextInt()) {
			count += inputScanner.nextInt();
		}
		System.out.println(count);
	}
}
