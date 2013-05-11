import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class self_describing_numbers {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid file input");
		}
		while (inputScanner.hasNextLine()) {
			String input = inputScanner.nextLine();
			boolean output = true;
			for (int x = 0; x < input.length(); x++) {
				int count = 0;
				int digit;
				if (x != input.length() - 1) {
					digit = Integer.parseInt(input.substring(x,x+1));
				}
				else {
					digit = Integer.parseInt(input.substring(x));
				}
				for (int y = 0; y < input.length(); y++) {
					if (y != input.length() - 1) {
						if (x == Integer.parseInt(input.substring(y,y+1))) {
							count++;
						}
					}
					else {
						if (x == Integer.parseInt(input.substring(y))) {
							count++;
						}
					}
				}
				if (digit != count) {	
					output = false;
					break;
				}
			}
			if (output) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}
}
