import java.io.File;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		}
		catch (Exception e) {
			System.err.println("Invalid file input");
		}
		int input;
		int count;
		int count2;
		int count3;
		while (inputScanner.hasNextLine()) {
			count = 1;
			count2 = 0;
			count3 = 0;
			input = Integer.parseInt(inputScanner.nextLine());
			
			if (input == 1) {
				System.out.println(count);
			}
			
			for (int x = 1; x < input; x++) {
				count3 = count;
				count += count2;
				count2 = count3;
			}
			System.out.println(count);
		}
	}
}
