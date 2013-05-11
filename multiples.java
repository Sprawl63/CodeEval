import java.io.File;
import java.util.Scanner;


public class multiples {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		}
		catch (Exception e) {
			System.err.println("Invalid file input");
		}
		while (inputScanner.hasNextLine()) {
			String line = inputScanner.nextLine();
			int min = Integer.parseInt(line.split(",")[0]);
			int n = Integer.parseInt(line.split(",")[1]);
			while (min > n) {
				n += n;
			}
			System.out.println(n);
		}
	}
}
