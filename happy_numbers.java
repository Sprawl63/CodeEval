import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


public class happy_numbers {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		while (inputScanner.hasNextLine()) {
			int input = Integer.parseInt(inputScanner.nextLine());
			LinkedList<Integer> checkList = new LinkedList<Integer>();
			while (input != 1 && !checkList.contains(input)) {
				checkList.add(input);
				String stringInput = Integer.toString(input);
				int[] newInput = new int[stringInput.length()];
				for (int x = 0; x < stringInput.length(); x++) {
					if (x != stringInput.length() - 1) {
						newInput[x] = Integer.parseInt(stringInput.substring(x,x+1));
						newInput[x] = newInput[x] * newInput[x];
					}
					else {
						newInput[x] = Integer.parseInt(stringInput.substring(x));
						newInput[x] = newInput[x] * newInput[x];
					}
				}
				input = 0;
				for (int x = 0; x < newInput.length; x++) {
					input += newInput[x];
				}
			}
			if (input == 1) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
}
