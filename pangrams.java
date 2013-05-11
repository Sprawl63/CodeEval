import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class pangrams {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		}
		catch (Exception e) {
			System.err.println("Invalid file input");
		}
		while (inputScanner.hasNextLine()) {
			HashSet<Character> alphabet = new HashSet<Character>();
			for (int x = 0; x < 26; x++) {
				alphabet.add((char)((int)'a'+ x));
			}
			HashSet<Character> letters = new HashSet<Character>();
			String input = inputScanner.nextLine().toLowerCase();
			for (int x = 0; x < input.length(); x++) {
				if (x != input.length() -1) {
					letters.add(input.substring(x,x+1).toCharArray()[0]);
				}
				else {
					letters.add(input.substring(x).toCharArray()[0]);
				}
			}
			Iterator<Character> subtraction = letters.iterator();
			while (subtraction.hasNext()) {
				alphabet.remove(subtraction.next());
			}
			if (alphabet.size() == 0) {
				System.out.println("NULL");
			}
			else {
				Iterator<Character> outputIterator = alphabet.iterator();
				char[] output = new char[alphabet.size()];
				for (int x = 0; x < output.length; x++) {
					output[x] = outputIterator.next();
				}
				Arrays.sort(output);
				for (int x = 0; x < output.length; x++) {
					System.out.print(output[x]);
				}
				System.out.print("\n");
			}
		}
	}
}
