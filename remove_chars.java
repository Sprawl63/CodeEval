import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class remove_chars {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		while (inputScanner.hasNextLine()) {
			String input = inputScanner.nextLine();
			String oldLine = input.split(",")[0];
			char[] replaceWords = input.split(",")[1].replace(" ","").toCharArray();
			for (int x = 0; x < replaceWords.length; x++) {
				oldLine = oldLine.replace(String.valueOf(replaceWords[x]), "");
			}
			System.out.println(oldLine);
		}
	}
}
