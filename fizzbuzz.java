import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fizzbuzz {
	public static void main(String args[]) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid file input.");
		}
		while (inputScanner.hasNext()) {
			int fizz = inputScanner.nextInt();
			int buzz = inputScanner.nextInt();
			int count = inputScanner.nextInt();
			for (int x = 1; x <= count; x++) {
				if (x % fizz == 0) {
					System.out.print("F");
				}
				if (x % buzz == 0) {
					System.out.print("B");
				}
				if (x % fizz != 0 && x % buzz != 0) {
					System.out.print(x);
				}
				if (x != count) {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
