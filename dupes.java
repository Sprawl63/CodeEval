import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class dupes {
	public static void main(String[] args) {
		Scanner inputScanner = null;
		try {
			inputScanner = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			System.err.println("Invalid input file.");
		}
		while (inputScanner.hasNextLine()) {
			HashSet<Integer> list = new HashSet<Integer>();
			String[] inputList = inputScanner.nextLine().split(",");
			for (int x = 0; x < inputList.length; x++) {
				list.add(Integer.parseInt(inputList[x]));
			}
			Iterator<Integer> listIterator = list.iterator();
			int[] outputArray = new int[list.size()];
			for (int x = 0; listIterator.hasNext(); x++) {
				outputArray[x] = listIterator.next();
			}
			Arrays.sort(outputArray);
			for (int x = 0; x < outputArray.length; x++) {
				System.out.print(outputArray[x]);
				if (x != outputArray.length - 1) {
					System.out.print(",");
				}
			}
			System.out.print("\n");
		}
		
	}
}
