import java.io.File;
import java.util.Scanner;


public class position {
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
			int x = Integer.parseInt(line.split(",")[0]);
			int y = Integer.parseInt(line.split(",")[1]);
			int z = Integer.parseInt(line.split(",")[2]);
			String number = Integer.toBinaryString(x);
			String bit1 = (y == number.length())? number.substring(number.length() - y) : number.substring(number.length() - y,number.length() - y + 1);
			String bit2 = (z == number.length())? number.substring(number.length() - z) : number.substring(number.length() - z,number.length() - z + 1);
			if (bit1.equals(bit2)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}
}
